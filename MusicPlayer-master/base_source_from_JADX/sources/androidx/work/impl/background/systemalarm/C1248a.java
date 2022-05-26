package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.C1405l;
import androidx.work.impl.C1285j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p012n.C1325g;
import androidx.work.impl.p012n.C1326h;
import androidx.work.impl.utils.C1364c;
import com.un4seen.bass.BASS;

/* renamed from: androidx.work.impl.background.systemalarm.a */
/* compiled from: Alarms */
class C1248a {

    /* renamed from: a */
    private static final String f5072a = C1405l.m7462f("Alarms");

    /* renamed from: a */
    public static void m6965a(Context context, C1285j jVar, String str) {
        C1326h K = jVar.mo6611o().mo6524K();
        C1325g c = K.mo6696c(str);
        if (c != null) {
            m6966b(context, str, c.f5299b);
            C1405l.m7460c().mo6816a(f5072a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str}), new Throwable[0]);
            K.mo6697d(str);
        }
    }

    /* renamed from: b */
    private static void m6966b(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1249b.m6970b(context, str), Build.VERSION.SDK_INT >= 23 ? BASS.BASS_SPEAKER_REAR2RIGHT : 536870912);
        if (service != null && alarmManager != null) {
            C1405l.m7460c().mo6816a(f5072a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    /* renamed from: c */
    public static void m6967c(Context context, C1285j jVar, String str, long j) {
        WorkDatabase o = jVar.mo6611o();
        C1326h K = o.mo6524K();
        C1325g c = K.mo6696c(str);
        if (c != null) {
            m6966b(context, str, c.f5299b);
            m6968d(context, str, c.f5299b, j);
            return;
        }
        int b = new C1364c(o).mo6757b();
        K.mo6695b(new C1325g(str, b));
        m6968d(context, str, b, j);
    }

    /* renamed from: d */
    private static void m6968d(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = Build.VERSION.SDK_INT;
        PendingIntent service = PendingIntent.getService(context, i, C1249b.m6970b(context, str), i2 >= 23 ? 201326592 : 134217728);
        if (alarmManager == null) {
            return;
        }
        if (i2 >= 19) {
            alarmManager.setExact(0, j, service);
        } else {
            alarmManager.set(0, j, service);
        }
    }
}
