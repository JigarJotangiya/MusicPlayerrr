package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C1228b;
import androidx.work.C1241i;
import androidx.work.C1405l;
import androidx.work.C1421u;
import androidx.work.impl.C1265f;
import androidx.work.impl.C1284i;
import androidx.work.impl.C1285j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.C1260b;
import androidx.work.impl.p012n.C1335n;
import androidx.work.impl.p012n.C1340p;
import androidx.work.impl.p012n.C1342q;
import com.un4seen.bass.BASS;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p082e.p109h.p115l.C3643a;

public class ForceStopRunnable implements Runnable {

    /* renamed from: j */
    private static final String f5350j = C1405l.m7462f("ForceStopRunnable");

    /* renamed from: k */
    private static final long f5351k = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: g */
    private final Context f5352g;

    /* renamed from: h */
    private final C1285j f5353h;

    /* renamed from: i */
    private int f5354i = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        private static final String f5355a = C1405l.m7462f("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                C1405l.m7460c().mo6819g(f5355a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.m7351g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, C1285j jVar) {
        this.f5352g = context.getApplicationContext();
        this.f5353h = jVar;
    }

    /* renamed from: c */
    static Intent m7349c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: d */
    private static PendingIntent m7350d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m7349c(context), i);
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: g */
    static void m7351g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d = m7350d(context, C3643a.m15699c() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f5351k;
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, d);
        } else {
            alarmManager.set(0, currentTimeMillis, d);
        }
    }

    /* renamed from: a */
    public boolean mo6740a() {
        boolean i = Build.VERSION.SDK_INT >= 23 ? C1260b.m7022i(this.f5352g, this.f5353h) : false;
        WorkDatabase o = this.f5353h.mo6611o();
        C1342q N = o.mo6527N();
        C1335n M = o.mo6526M();
        o.mo5576c();
        try {
            List<C1340p> j = N.mo6724j();
            boolean z = j != null && !j.isEmpty();
            if (z) {
                for (C1340p next : j) {
                    N.mo6716b(C1421u.ENQUEUED, next.f5313a);
                    N.mo6717c(next.f5313a, -1);
                }
            }
            M.mo6703b();
            o.mo5573C();
            if (z || i) {
                return true;
            }
            return false;
        } finally {
            o.mo5580g();
        }
    }

    /* renamed from: b */
    public void mo6741b() {
        boolean a = mo6740a();
        if (mo6744h()) {
            C1405l.m7460c().mo6816a(f5350j, "Rescheduling Workers.", new Throwable[0]);
            this.f5353h.mo6614s();
            this.f5353h.mo6608l().mo6760c(false);
        } else if (mo6742e()) {
            C1405l.m7460c().mo6816a(f5350j, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f5353h.mo6614s();
        } else if (a) {
            C1405l.m7460c().mo6816a(f5350j, "Found unfinished work, scheduling it.", new Throwable[0]);
            C1265f.m7047b(this.f5353h.mo6607i(), this.f5353h.mo6611o(), this.f5353h.mo6610n());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: e */
    public boolean mo6742e() {
        int i = 536870912;
        try {
            if (C3643a.m15699c()) {
                i = BASS.BASS_SPEAKER_REARRIGHT;
            }
            PendingIntent d = m7350d(this.f5352g, i);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d != null) {
                    d.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f5352g.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                        if (((ApplicationExitInfo) historicalProcessExitReasons.get(i2)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (d == null) {
                m7351g(this.f5352g);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e) {
            C1405l.m7460c().mo6820h(f5350j, "Ignoring exception", e);
            return true;
        }
    }

    /* renamed from: f */
    public boolean mo6743f() {
        C1228b i = this.f5353h.mo6607i();
        if (TextUtils.isEmpty(i.mo6459c())) {
            C1405l.m7460c().mo6816a(f5350j, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b = C1367f.m7387b(this.f5352g, i);
        C1405l.m7460c().mo6816a(f5350j, String.format("Is default app process = %s", new Object[]{Boolean.valueOf(b)}), new Throwable[0]);
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo6744h() {
        return this.f5353h.mo6608l().mo6759a();
    }

    /* renamed from: i */
    public void mo6745i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    public void run() {
        try {
            if (!mo6743f()) {
                this.f5353h.mo6613r();
                return;
            }
            while (true) {
                C1284i.m7096e(this.f5352g);
                C1405l.m7460c().mo6816a(f5350j, "Performing cleanup operations.", new Throwable[0]);
                mo6741b();
                break;
            }
            this.f5353h.mo6613r();
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
            int i = this.f5354i + 1;
            this.f5354i = i;
            if (i >= 3) {
                C1405l c = C1405l.m7460c();
                String str = f5350j;
                c.mo6817b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                C1241i d = this.f5353h.mo6607i().mo6460d();
                if (d != null) {
                    C1405l.m7460c().mo6816a(str, "Routing exception to the specified exception handler", illegalStateException);
                    d.mo6521a(illegalStateException);
                } else {
                    throw illegalStateException;
                }
            } else {
                C1405l.m7460c().mo6816a(f5350j, String.format("Retrying after %s", new Object[]{Long.valueOf(((long) i) * 300)}), e);
                mo6745i(((long) this.f5354i) * 300);
            }
        } catch (Throwable th) {
            this.f5353h.mo6613r();
            throw th;
        }
    }
}
