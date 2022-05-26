package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.C1405l;
import androidx.work.impl.C1246b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C1252e;
import androidx.work.impl.p012n.C1340p;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.work.impl.background.systemalarm.b */
/* compiled from: CommandHandler */
public class C1249b implements C1246b {

    /* renamed from: j */
    private static final String f5073j = C1405l.m7462f("CommandHandler");

    /* renamed from: g */
    private final Context f5074g;

    /* renamed from: h */
    private final Map<String, C1246b> f5075h = new HashMap();

    /* renamed from: i */
    private final Object f5076i = new Object();

    C1249b(Context context) {
        this.f5074g = context;
    }

    /* renamed from: a */
    static Intent m6969a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: b */
    static Intent m6970b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    static Intent m6971c(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    /* renamed from: e */
    static Intent m6972e(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* renamed from: f */
    static Intent m6973f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: g */
    static Intent m6974g(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: h */
    private void m6975h(Intent intent, int i, C1252e eVar) {
        C1405l.m7460c().mo6816a(f5073j, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new C1250c(this.f5074g, i, eVar).mo6539a();
    }

    /* renamed from: i */
    private void m6976i(Intent intent, int i, C1252e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f5076i) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            C1405l c = C1405l.m7460c();
            String str = f5073j;
            c.mo6816a(str, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.f5075h.containsKey(string)) {
                C1251d dVar = new C1251d(this.f5074g, i, string, eVar);
                this.f5075h.put(string, dVar);
                dVar.mo6542e();
            } else {
                C1405l.m7460c().mo6816a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }

    /* renamed from: j */
    private void m6977j(Intent intent, int i) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        C1405l.m7460c().mo6816a(f5073j, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        mo6531d(string, z);
    }

    /* renamed from: k */
    private void m6978k(Intent intent, int i, C1252e eVar) {
        C1405l.m7460c().mo6816a(f5073j, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        eVar.mo6548g().mo6614s();
    }

    /* renamed from: l */
    private void m6979l(Intent intent, int i, C1252e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        C1405l c = C1405l.m7460c();
        String str = f5073j;
        c.mo6816a(str, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase o = eVar.mo6548g().mo6611o();
        o.mo5576c();
        try {
            C1340p n = o.mo6527N().mo6728n(string);
            if (n == null) {
                C1405l c2 = C1405l.m7460c();
                c2.mo6820h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (n.f5314b.isFinished()) {
                C1405l c3 = C1405l.m7460c();
                c3.mo6820h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                o.mo5580g();
            } else {
                long a = n.mo6706a();
                if (!n.mo6707b()) {
                    C1405l.m7460c().mo6816a(str, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a)}), new Throwable[0]);
                    C1248a.m6967c(this.f5074g, eVar.mo6548g(), string, a);
                } else {
                    C1405l.m7460c().mo6816a(str, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a)}), new Throwable[0]);
                    C1248a.m6967c(this.f5074g, eVar.mo6548g(), string, a);
                    eVar.mo6551k(new C1252e.C1254b(eVar, m6969a(this.f5074g), i));
                }
                o.mo5573C();
                o.mo5580g();
            }
        } finally {
            o.mo5580g();
        }
    }

    /* renamed from: m */
    private void m6980m(Intent intent, C1252e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        C1405l.m7460c().mo6816a(f5073j, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        eVar.mo6548g().mo6619x(string);
        C1248a.m6965a(this.f5074g, eVar.mo6548g(), string);
        eVar.mo6531d(string, false);
    }

    /* renamed from: n */
    private static boolean m6981n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public void mo6531d(String str, boolean z) {
        synchronized (this.f5076i) {
            C1246b remove = this.f5075h.remove(str);
            if (remove != null) {
                remove.mo6531d(str, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo6537o() {
        boolean z;
        synchronized (this.f5076i) {
            z = !this.f5075h.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo6538p(Intent intent, int i, C1252e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m6975h(intent, i, eVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            m6978k(intent, i, eVar);
        } else if (!m6981n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            C1405l.m7460c().mo6817b(f5073j, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m6979l(intent, i, eVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            m6976i(intent, i, eVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m6980m(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m6977j(intent, i);
        } else {
            C1405l.m7460c().mo6820h(f5073j, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
        }
    }
}
