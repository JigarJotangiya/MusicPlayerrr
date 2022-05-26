package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C1239g;
import androidx.work.C1405l;
import androidx.work.impl.C1246b;
import androidx.work.impl.C1285j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p009m.C1295c;
import androidx.work.impl.p009m.C1296d;
import androidx.work.impl.p012n.C1340p;
import androidx.work.impl.utils.p014p.C1397a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: androidx.work.impl.foreground.b */
/* compiled from: SystemForegroundDispatcher */
public class C1270b implements C1295c, C1246b {

    /* renamed from: q */
    static final String f5154q = C1405l.m7462f("SystemFgDispatcher");

    /* renamed from: g */
    private Context f5155g;

    /* renamed from: h */
    private C1285j f5156h;

    /* renamed from: i */
    private final C1397a f5157i;

    /* renamed from: j */
    final Object f5158j = new Object();

    /* renamed from: k */
    String f5159k;

    /* renamed from: l */
    final Map<String, C1239g> f5160l;

    /* renamed from: m */
    final Map<String, C1340p> f5161m;

    /* renamed from: n */
    final Set<C1340p> f5162n;

    /* renamed from: o */
    final C1296d f5163o;

    /* renamed from: p */
    private C1272b f5164p;

    /* renamed from: androidx.work.impl.foreground.b$a */
    /* compiled from: SystemForegroundDispatcher */
    class C1271a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ WorkDatabase f5165g;

        /* renamed from: h */
        final /* synthetic */ String f5166h;

        C1271a(WorkDatabase workDatabase, String str) {
            this.f5165g = workDatabase;
            this.f5166h = str;
        }

        public void run() {
            C1340p n = this.f5165g.mo6527N().mo6728n(this.f5166h);
            if (n != null && n.mo6707b()) {
                synchronized (C1270b.this.f5158j) {
                    C1270b.this.f5161m.put(this.f5166h, n);
                    C1270b.this.f5162n.add(n);
                    C1270b bVar = C1270b.this;
                    bVar.f5163o.mo6644d(bVar.f5162n);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.b$b */
    /* compiled from: SystemForegroundDispatcher */
    interface C1272b {
        /* renamed from: b */
        void mo6580b(int i, int i2, Notification notification);

        /* renamed from: c */
        void mo6581c(int i, Notification notification);

        /* renamed from: d */
        void mo6582d(int i);

        void stop();
    }

    C1270b(Context context) {
        this.f5155g = context;
        C1285j k = C1285j.m7100k(this.f5155g);
        this.f5156h = k;
        C1397a p = k.mo6612p();
        this.f5157i = p;
        this.f5159k = null;
        this.f5160l = new LinkedHashMap();
        this.f5162n = new HashSet();
        this.f5161m = new HashMap();
        this.f5163o = new C1296d(this.f5155g, p, this);
        this.f5156h.mo6609m().mo6568c(this);
    }

    /* renamed from: a */
    public static Intent m7055a(Context context, String str, C1239g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.mo6516c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.mo6514a());
        intent.putExtra("KEY_NOTIFICATION", gVar.mo6515b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    public static Intent m7056c(Context context, String str, C1239g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.mo6516c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.mo6514a());
        intent.putExtra("KEY_NOTIFICATION", gVar.mo6515b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: e */
    public static Intent m7057e(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    /* renamed from: g */
    private void m7058g(Intent intent) {
        C1405l.m7460c().mo6818d(f5154q, String.format("Stopping foreground work for %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f5156h.mo6604f(UUID.fromString(stringExtra));
        }
    }

    /* renamed from: h */
    private void m7059h(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C1405l.m7460c().mo6816a(f5154q, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)}), new Throwable[0]);
        if (notification != null && this.f5164p != null) {
            this.f5160l.put(stringExtra, new C1239g(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.f5159k)) {
                this.f5159k = stringExtra;
                this.f5164p.mo6580b(intExtra, intExtra2, notification);
                return;
            }
            this.f5164p.mo6581c(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry<String, C1239g> value : this.f5160l.entrySet()) {
                    i |= ((C1239g) value.getValue()).mo6514a();
                }
                C1239g gVar = this.f5160l.get(this.f5159k);
                if (gVar != null) {
                    this.f5164p.mo6580b(gVar.mo6516c(), i, gVar.mo6515b());
                }
            }
        }
    }

    /* renamed from: i */
    private void m7060i(Intent intent) {
        C1405l.m7460c().mo6818d(f5154q, String.format("Started foreground service %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        this.f5157i.mo6804b(new C1271a(this.f5156h.mo6611o(), stringExtra));
    }

    /* renamed from: b */
    public void mo6541b(List<String> list) {
        if (!list.isEmpty()) {
            for (String next : list) {
                C1405l.m7460c().mo6816a(f5154q, String.format("Constraints unmet for WorkSpec %s", new Object[]{next}), new Throwable[0]);
                this.f5156h.mo6618w(next);
            }
        }
    }

    /* renamed from: d */
    public void mo6531d(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.f5158j) {
            C1340p remove = this.f5161m.remove(str);
            if (remove != null ? this.f5162n.remove(remove) : false) {
                this.f5163o.mo6644d(this.f5162n);
            }
        }
        C1239g remove2 = this.f5160l.remove(str);
        if (str.equals(this.f5159k) && this.f5160l.size() > 0) {
            Iterator it = this.f5160l.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f5159k = (String) entry.getKey();
            if (this.f5164p != null) {
                C1239g gVar = (C1239g) entry.getValue();
                this.f5164p.mo6580b(gVar.mo6516c(), gVar.mo6514a(), gVar.mo6515b());
                this.f5164p.mo6582d(gVar.mo6516c());
            }
        }
        C1272b bVar = this.f5164p;
        if (remove2 != null && bVar != null) {
            C1405l.m7460c().mo6816a(f5154q, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[]{Integer.valueOf(remove2.mo6516c()), str, Integer.valueOf(remove2.mo6514a())}), new Throwable[0]);
            bVar.mo6582d(remove2.mo6516c());
        }
    }

    /* renamed from: f */
    public void mo6543f(List<String> list) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo6587j(Intent intent) {
        C1405l.m7460c().mo6818d(f5154q, "Stopping foreground service", new Throwable[0]);
        C1272b bVar = this.f5164p;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo6588k() {
        this.f5164p = null;
        synchronized (this.f5158j) {
            this.f5163o.mo6645e();
        }
        this.f5156h.mo6609m().mo6572i(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo6589l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m7060i(intent);
            m7059h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            m7059h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            m7058g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            mo6587j(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6590m(C1272b bVar) {
        if (this.f5164p != null) {
            C1405l.m7460c().mo6817b(f5154q, "A callback already exists.", new Throwable[0]);
        } else {
            this.f5164p = bVar;
        }
    }
}
