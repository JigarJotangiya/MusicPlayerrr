package androidx.work.impl.p012n;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C0955g0;
import androidx.room.C0994s0;
import androidx.room.C1008v0;
import androidx.room.C1025z0;
import androidx.room.p006d1.C0940b;
import androidx.room.p006d1.C0941c;
import androidx.room.p006d1.C0944f;
import androidx.work.C1232c;
import androidx.work.C1236e;
import androidx.work.C1421u;
import androidx.work.impl.p012n.C1340p;
import java.util.ArrayList;
import java.util.List;
import p082e.p149u.p150a.C4222f;

/* renamed from: androidx.work.impl.n.r */
/* compiled from: WorkSpecDao_Impl */
public final class C1343r implements C1342q {

    /* renamed from: a */
    private final C0994s0 f5333a;

    /* renamed from: b */
    private final C0955g0<C1340p> f5334b;

    /* renamed from: c */
    private final C1025z0 f5335c;

    /* renamed from: d */
    private final C1025z0 f5336d;

    /* renamed from: e */
    private final C1025z0 f5337e;

    /* renamed from: f */
    private final C1025z0 f5338f;

    /* renamed from: g */
    private final C1025z0 f5339g;

    /* renamed from: h */
    private final C1025z0 f5340h;

    /* renamed from: i */
    private final C1025z0 f5341i;

    /* renamed from: androidx.work.impl.n.r$a */
    /* compiled from: WorkSpecDao_Impl */
    class C1344a extends C0955g0<C1340p> {
        C1344a(C1343r rVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: i */
        public void mo5478g(C4222f fVar, C1340p pVar) {
            String str = pVar.f5313a;
            if (str == null) {
                fVar.mo5561k0(1);
            } else {
                fVar.mo5562r(1, str);
            }
            fVar.mo5557L(2, (long) C1357v.m7348j(pVar.f5314b));
            String str2 = pVar.f5315c;
            if (str2 == null) {
                fVar.mo5561k0(3);
            } else {
                fVar.mo5562r(3, str2);
            }
            String str3 = pVar.f5316d;
            if (str3 == null) {
                fVar.mo5561k0(4);
            } else {
                fVar.mo5562r(4, str3);
            }
            byte[] k = C1236e.m6904k(pVar.f5317e);
            if (k == null) {
                fVar.mo5561k0(5);
            } else {
                fVar.mo5558S(5, k);
            }
            byte[] k2 = C1236e.m6904k(pVar.f5318f);
            if (k2 == null) {
                fVar.mo5561k0(6);
            } else {
                fVar.mo5558S(6, k2);
            }
            fVar.mo5557L(7, pVar.f5319g);
            fVar.mo5557L(8, pVar.f5320h);
            fVar.mo5557L(9, pVar.f5321i);
            fVar.mo5557L(10, (long) pVar.f5323k);
            fVar.mo5557L(11, (long) C1357v.m7339a(pVar.f5324l));
            fVar.mo5557L(12, pVar.f5325m);
            fVar.mo5557L(13, pVar.f5326n);
            fVar.mo5557L(14, pVar.f5327o);
            fVar.mo5557L(15, pVar.f5328p);
            fVar.mo5557L(16, pVar.f5329q ? 1 : 0);
            fVar.mo5557L(17, (long) C1357v.m7347i(pVar.f5330r));
            C1232c cVar = pVar.f5322j;
            if (cVar != null) {
                fVar.mo5557L(18, (long) C1357v.m7346h(cVar.mo6474b()));
                fVar.mo5557L(19, cVar.mo6480g() ? 1 : 0);
                fVar.mo5557L(20, cVar.mo6481h() ? 1 : 0);
                fVar.mo5557L(21, cVar.mo6479f() ? 1 : 0);
                fVar.mo5557L(22, cVar.mo6483i() ? 1 : 0);
                fVar.mo5557L(23, cVar.mo6475c());
                fVar.mo5557L(24, cVar.mo6476d());
                byte[] c = C1357v.m7341c(cVar.mo6473a());
                if (c == null) {
                    fVar.mo5561k0(25);
                } else {
                    fVar.mo5558S(25, c);
                }
            } else {
                fVar.mo5561k0(18);
                fVar.mo5561k0(19);
                fVar.mo5561k0(20);
                fVar.mo5561k0(21);
                fVar.mo5561k0(22);
                fVar.mo5561k0(23);
                fVar.mo5561k0(24);
                fVar.mo5561k0(25);
            }
        }
    }

    /* renamed from: androidx.work.impl.n.r$b */
    /* compiled from: WorkSpecDao_Impl */
    class C1345b extends C1025z0 {
        C1345b(C1343r rVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.n.r$c */
    /* compiled from: WorkSpecDao_Impl */
    class C1346c extends C1025z0 {
        C1346c(C1343r rVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.n.r$d */
    /* compiled from: WorkSpecDao_Impl */
    class C1347d extends C1025z0 {
        C1347d(C1343r rVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.n.r$e */
    /* compiled from: WorkSpecDao_Impl */
    class C1348e extends C1025z0 {
        C1348e(C1343r rVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.n.r$f */
    /* compiled from: WorkSpecDao_Impl */
    class C1349f extends C1025z0 {
        C1349f(C1343r rVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.n.r$g */
    /* compiled from: WorkSpecDao_Impl */
    class C1350g extends C1025z0 {
        C1350g(C1343r rVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.n.r$h */
    /* compiled from: WorkSpecDao_Impl */
    class C1351h extends C1025z0 {
        C1351h(C1343r rVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: androidx.work.impl.n.r$i */
    /* compiled from: WorkSpecDao_Impl */
    class C1352i extends C1025z0 {
        C1352i(C1343r rVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public C1343r(C0994s0 s0Var) {
        this.f5333a = s0Var;
        this.f5334b = new C1344a(this, s0Var);
        this.f5335c = new C1345b(this, s0Var);
        this.f5336d = new C1346c(this, s0Var);
        this.f5337e = new C1347d(this, s0Var);
        this.f5338f = new C1348e(this, s0Var);
        this.f5339g = new C1349f(this, s0Var);
        this.f5340h = new C1350g(this, s0Var);
        this.f5341i = new C1351h(this, s0Var);
        new C1352i(this, s0Var);
    }

    /* renamed from: a */
    public void mo6715a(String str) {
        this.f5333a.mo5575b();
        C4222f a = this.f5335c.mo5690a();
        if (str == null) {
            a.mo5561k0(1);
        } else {
            a.mo5562r(1, str);
        }
        this.f5333a.mo5576c();
        try {
            a.mo5568u();
            this.f5333a.mo5573C();
        } finally {
            this.f5333a.mo5580g();
            this.f5335c.mo5693f(a);
        }
    }

    /* renamed from: b */
    public int mo6716b(C1421u uVar, String... strArr) {
        this.f5333a.mo5575b();
        StringBuilder b = C0944f.m5710b();
        b.append("UPDATE workspec SET state=");
        b.append("?");
        b.append(" WHERE id IN (");
        C0944f.m5709a(b, strArr.length);
        b.append(")");
        C4222f d = this.f5333a.mo5577d(b.toString());
        d.mo5557L(1, (long) C1357v.m7348j(uVar));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                d.mo5561k0(i);
            } else {
                d.mo5562r(i, str);
            }
            i++;
        }
        this.f5333a.mo5576c();
        try {
            int u = d.mo5568u();
            this.f5333a.mo5573C();
            return u;
        } finally {
            this.f5333a.mo5580g();
        }
    }

    /* renamed from: c */
    public int mo6717c(String str, long j) {
        this.f5333a.mo5575b();
        C4222f a = this.f5340h.mo5690a();
        a.mo5557L(1, j);
        if (str == null) {
            a.mo5561k0(2);
        } else {
            a.mo5562r(2, str);
        }
        this.f5333a.mo5576c();
        try {
            int u = a.mo5568u();
            this.f5333a.mo5573C();
            return u;
        } finally {
            this.f5333a.mo5580g();
            this.f5340h.mo5693f(a);
        }
    }

    /* renamed from: d */
    public List<C1340p.C1341a> mo6718d(String str) {
        C1008v0 p = C1008v0.m5896p("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            p.mo5561k0(1);
        } else {
            p.mo5562r(1, str);
        }
        this.f5333a.mo5575b();
        Cursor c = C0941c.m5704c(this.f5333a, p, false, (CancellationSignal) null);
        try {
            int e = C0940b.m5701e(c, "id");
            int e2 = C0940b.m5701e(c, "state");
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                C1340p.C1341a aVar = new C1340p.C1341a();
                aVar.f5331a = c.getString(e);
                aVar.f5332b = C1357v.m7345g(c.getInt(e2));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            c.close();
            p.mo5622H();
        }
    }

    /* renamed from: e */
    public List<C1340p> mo6719e(long j) {
        C1008v0 v0Var;
        C1008v0 p = C1008v0.m5896p("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        p.mo5557L(1, j);
        this.f5333a.mo5575b();
        Cursor c = C0941c.m5704c(this.f5333a, p, false, (CancellationSignal) null);
        try {
            int e = C0940b.m5701e(c, "required_network_type");
            int e2 = C0940b.m5701e(c, "requires_charging");
            int e3 = C0940b.m5701e(c, "requires_device_idle");
            int e4 = C0940b.m5701e(c, "requires_battery_not_low");
            int e5 = C0940b.m5701e(c, "requires_storage_not_low");
            int e6 = C0940b.m5701e(c, "trigger_content_update_delay");
            int e7 = C0940b.m5701e(c, "trigger_max_content_delay");
            int e8 = C0940b.m5701e(c, "content_uri_triggers");
            int e9 = C0940b.m5701e(c, "id");
            int e10 = C0940b.m5701e(c, "state");
            int e11 = C0940b.m5701e(c, "worker_class_name");
            int e12 = C0940b.m5701e(c, "input_merger_class_name");
            int e13 = C0940b.m5701e(c, "input");
            int e14 = C0940b.m5701e(c, "output");
            v0Var = p;
            try {
                int e15 = C0940b.m5701e(c, "initial_delay");
                int e16 = C0940b.m5701e(c, "interval_duration");
                int e17 = C0940b.m5701e(c, "flex_duration");
                int e18 = C0940b.m5701e(c, "run_attempt_count");
                int e19 = C0940b.m5701e(c, "backoff_policy");
                int e20 = C0940b.m5701e(c, "backoff_delay_duration");
                int e21 = C0940b.m5701e(c, "period_start_time");
                int e22 = C0940b.m5701e(c, "minimum_retention_duration");
                int e23 = C0940b.m5701e(c, "schedule_requested_at");
                int e24 = C0940b.m5701e(c, "run_in_foreground");
                int e25 = C0940b.m5701e(c, "out_of_quota_policy");
                int i = e14;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    String string = c.getString(e9);
                    int i2 = e9;
                    String string2 = c.getString(e11);
                    int i3 = e11;
                    C1232c cVar = new C1232c();
                    int i4 = e;
                    cVar.mo6485k(C1357v.m7343e(c.getInt(e)));
                    cVar.mo6487m(c.getInt(e2) != 0);
                    cVar.mo6488n(c.getInt(e3) != 0);
                    cVar.mo6486l(c.getInt(e4) != 0);
                    cVar.mo6489o(c.getInt(e5) != 0);
                    int i5 = e2;
                    int i6 = e3;
                    cVar.mo6490p(c.getLong(e6));
                    cVar.mo6491q(c.getLong(e7));
                    cVar.mo6484j(C1357v.m7340b(c.getBlob(e8)));
                    C1340p pVar = new C1340p(string, string2);
                    pVar.f5314b = C1357v.m7345g(c.getInt(e10));
                    pVar.f5316d = c.getString(e12);
                    pVar.f5317e = C1236e.m6903g(c.getBlob(e13));
                    int i7 = i;
                    pVar.f5318f = C1236e.m6903g(c.getBlob(i7));
                    int i8 = e15;
                    int i9 = i5;
                    i = i7;
                    pVar.f5319g = c.getLong(i8);
                    int i10 = e12;
                    int i11 = e16;
                    pVar.f5320h = c.getLong(i11);
                    int i12 = i8;
                    int i13 = e4;
                    int i14 = e17;
                    pVar.f5321i = c.getLong(i14);
                    int i15 = e18;
                    pVar.f5323k = c.getInt(i15);
                    int i16 = e19;
                    int i17 = i11;
                    pVar.f5324l = C1357v.m7342d(c.getInt(i16));
                    e17 = i14;
                    int i18 = i13;
                    int i19 = e20;
                    pVar.f5325m = c.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = e21;
                    pVar.f5326n = c.getLong(i22);
                    int i23 = i19;
                    e21 = i22;
                    int i24 = e22;
                    pVar.f5327o = c.getLong(i24);
                    int i25 = i20;
                    int i26 = e23;
                    pVar.f5328p = c.getLong(i26);
                    int i27 = e24;
                    pVar.f5329q = c.getInt(i27) != 0;
                    int i28 = e25;
                    int i29 = i26;
                    pVar.f5330r = C1357v.m7344f(c.getInt(i28));
                    pVar.f5322j = cVar;
                    arrayList.add(pVar);
                    e2 = i9;
                    e25 = i28;
                    e12 = i10;
                    e15 = i12;
                    e16 = i17;
                    e18 = i25;
                    e23 = i29;
                    e9 = i2;
                    e11 = i3;
                    e = i4;
                    e24 = i27;
                    e22 = i24;
                    e3 = i6;
                    int i30 = i21;
                    e20 = i23;
                    e4 = i18;
                    e19 = i30;
                }
                c.close();
                v0Var.mo5622H();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c.close();
                v0Var.mo5622H();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            v0Var = p;
            c.close();
            v0Var.mo5622H();
            throw th;
        }
    }

    /* renamed from: f */
    public List<C1340p> mo6720f(int i) {
        C1008v0 v0Var;
        C1008v0 p = C1008v0.m5896p("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        p.mo5557L(1, (long) i);
        this.f5333a.mo5575b();
        Cursor c = C0941c.m5704c(this.f5333a, p, false, (CancellationSignal) null);
        try {
            int e = C0940b.m5701e(c, "required_network_type");
            int e2 = C0940b.m5701e(c, "requires_charging");
            int e3 = C0940b.m5701e(c, "requires_device_idle");
            int e4 = C0940b.m5701e(c, "requires_battery_not_low");
            int e5 = C0940b.m5701e(c, "requires_storage_not_low");
            int e6 = C0940b.m5701e(c, "trigger_content_update_delay");
            int e7 = C0940b.m5701e(c, "trigger_max_content_delay");
            int e8 = C0940b.m5701e(c, "content_uri_triggers");
            int e9 = C0940b.m5701e(c, "id");
            int e10 = C0940b.m5701e(c, "state");
            int e11 = C0940b.m5701e(c, "worker_class_name");
            int e12 = C0940b.m5701e(c, "input_merger_class_name");
            int e13 = C0940b.m5701e(c, "input");
            int e14 = C0940b.m5701e(c, "output");
            v0Var = p;
            try {
                int e15 = C0940b.m5701e(c, "initial_delay");
                int e16 = C0940b.m5701e(c, "interval_duration");
                int e17 = C0940b.m5701e(c, "flex_duration");
                int e18 = C0940b.m5701e(c, "run_attempt_count");
                int e19 = C0940b.m5701e(c, "backoff_policy");
                int e20 = C0940b.m5701e(c, "backoff_delay_duration");
                int e21 = C0940b.m5701e(c, "period_start_time");
                int e22 = C0940b.m5701e(c, "minimum_retention_duration");
                int e23 = C0940b.m5701e(c, "schedule_requested_at");
                int e24 = C0940b.m5701e(c, "run_in_foreground");
                int e25 = C0940b.m5701e(c, "out_of_quota_policy");
                int i2 = e14;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    String string = c.getString(e9);
                    int i3 = e9;
                    String string2 = c.getString(e11);
                    int i4 = e11;
                    C1232c cVar = new C1232c();
                    int i5 = e;
                    cVar.mo6485k(C1357v.m7343e(c.getInt(e)));
                    cVar.mo6487m(c.getInt(e2) != 0);
                    cVar.mo6488n(c.getInt(e3) != 0);
                    cVar.mo6486l(c.getInt(e4) != 0);
                    cVar.mo6489o(c.getInt(e5) != 0);
                    int i6 = e2;
                    int i7 = e3;
                    cVar.mo6490p(c.getLong(e6));
                    cVar.mo6491q(c.getLong(e7));
                    cVar.mo6484j(C1357v.m7340b(c.getBlob(e8)));
                    C1340p pVar = new C1340p(string, string2);
                    pVar.f5314b = C1357v.m7345g(c.getInt(e10));
                    pVar.f5316d = c.getString(e12);
                    pVar.f5317e = C1236e.m6903g(c.getBlob(e13));
                    int i8 = i2;
                    pVar.f5318f = C1236e.m6903g(c.getBlob(i8));
                    int i9 = i6;
                    i2 = i8;
                    int i10 = e15;
                    pVar.f5319g = c.getLong(i10);
                    int i11 = e12;
                    int i12 = e16;
                    pVar.f5320h = c.getLong(i12);
                    int i13 = i10;
                    int i14 = e4;
                    int i15 = e17;
                    pVar.f5321i = c.getLong(i15);
                    int i16 = e18;
                    pVar.f5323k = c.getInt(i16);
                    int i17 = e19;
                    int i18 = i12;
                    pVar.f5324l = C1357v.m7342d(c.getInt(i17));
                    e17 = i15;
                    int i19 = i14;
                    int i20 = e20;
                    pVar.f5325m = c.getLong(i20);
                    int i21 = i16;
                    int i22 = i17;
                    int i23 = e21;
                    pVar.f5326n = c.getLong(i23);
                    int i24 = i20;
                    e21 = i23;
                    int i25 = e22;
                    pVar.f5327o = c.getLong(i25);
                    int i26 = i21;
                    int i27 = e23;
                    pVar.f5328p = c.getLong(i27);
                    int i28 = e24;
                    pVar.f5329q = c.getInt(i28) != 0;
                    int i29 = e25;
                    int i30 = i27;
                    pVar.f5330r = C1357v.m7344f(c.getInt(i29));
                    pVar.f5322j = cVar;
                    arrayList.add(pVar);
                    e25 = i29;
                    e2 = i9;
                    e12 = i11;
                    e15 = i13;
                    e16 = i18;
                    e18 = i26;
                    e23 = i30;
                    e9 = i3;
                    e11 = i4;
                    e = i5;
                    e24 = i28;
                    e22 = i25;
                    e3 = i7;
                    int i31 = i22;
                    e20 = i24;
                    e4 = i19;
                    e19 = i31;
                }
                c.close();
                v0Var.mo5622H();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c.close();
                v0Var.mo5622H();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            v0Var = p;
            c.close();
            v0Var.mo5622H();
            throw th;
        }
    }

    /* renamed from: g */
    public void mo6721g(C1340p pVar) {
        this.f5333a.mo5575b();
        this.f5333a.mo5576c();
        try {
            this.f5334b.mo5479h(pVar);
            this.f5333a.mo5573C();
        } finally {
            this.f5333a.mo5580g();
        }
    }

    /* renamed from: h */
    public List<C1340p> mo6722h() {
        C1008v0 v0Var;
        C1008v0 p = C1008v0.m5896p("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f5333a.mo5575b();
        Cursor c = C0941c.m5704c(this.f5333a, p, false, (CancellationSignal) null);
        try {
            int e = C0940b.m5701e(c, "required_network_type");
            int e2 = C0940b.m5701e(c, "requires_charging");
            int e3 = C0940b.m5701e(c, "requires_device_idle");
            int e4 = C0940b.m5701e(c, "requires_battery_not_low");
            int e5 = C0940b.m5701e(c, "requires_storage_not_low");
            int e6 = C0940b.m5701e(c, "trigger_content_update_delay");
            int e7 = C0940b.m5701e(c, "trigger_max_content_delay");
            int e8 = C0940b.m5701e(c, "content_uri_triggers");
            int e9 = C0940b.m5701e(c, "id");
            int e10 = C0940b.m5701e(c, "state");
            int e11 = C0940b.m5701e(c, "worker_class_name");
            int e12 = C0940b.m5701e(c, "input_merger_class_name");
            int e13 = C0940b.m5701e(c, "input");
            int e14 = C0940b.m5701e(c, "output");
            v0Var = p;
            try {
                int e15 = C0940b.m5701e(c, "initial_delay");
                int e16 = C0940b.m5701e(c, "interval_duration");
                int e17 = C0940b.m5701e(c, "flex_duration");
                int e18 = C0940b.m5701e(c, "run_attempt_count");
                int e19 = C0940b.m5701e(c, "backoff_policy");
                int e20 = C0940b.m5701e(c, "backoff_delay_duration");
                int e21 = C0940b.m5701e(c, "period_start_time");
                int e22 = C0940b.m5701e(c, "minimum_retention_duration");
                int e23 = C0940b.m5701e(c, "schedule_requested_at");
                int e24 = C0940b.m5701e(c, "run_in_foreground");
                int e25 = C0940b.m5701e(c, "out_of_quota_policy");
                int i = e14;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    String string = c.getString(e9);
                    int i2 = e9;
                    String string2 = c.getString(e11);
                    int i3 = e11;
                    C1232c cVar = new C1232c();
                    int i4 = e;
                    cVar.mo6485k(C1357v.m7343e(c.getInt(e)));
                    cVar.mo6487m(c.getInt(e2) != 0);
                    cVar.mo6488n(c.getInt(e3) != 0);
                    cVar.mo6486l(c.getInt(e4) != 0);
                    cVar.mo6489o(c.getInt(e5) != 0);
                    int i5 = e2;
                    int i6 = e3;
                    cVar.mo6490p(c.getLong(e6));
                    cVar.mo6491q(c.getLong(e7));
                    cVar.mo6484j(C1357v.m7340b(c.getBlob(e8)));
                    C1340p pVar = new C1340p(string, string2);
                    pVar.f5314b = C1357v.m7345g(c.getInt(e10));
                    pVar.f5316d = c.getString(e12);
                    pVar.f5317e = C1236e.m6903g(c.getBlob(e13));
                    int i7 = i;
                    pVar.f5318f = C1236e.m6903g(c.getBlob(i7));
                    int i8 = i5;
                    i = i7;
                    int i9 = e15;
                    pVar.f5319g = c.getLong(i9);
                    int i10 = e13;
                    int i11 = e16;
                    pVar.f5320h = c.getLong(i11);
                    int i12 = i9;
                    int i13 = e4;
                    int i14 = e17;
                    pVar.f5321i = c.getLong(i14);
                    int i15 = e18;
                    pVar.f5323k = c.getInt(i15);
                    int i16 = e19;
                    int i17 = i11;
                    pVar.f5324l = C1357v.m7342d(c.getInt(i16));
                    e17 = i14;
                    int i18 = i13;
                    int i19 = e20;
                    pVar.f5325m = c.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = e21;
                    pVar.f5326n = c.getLong(i22);
                    int i23 = i19;
                    e21 = i22;
                    int i24 = e22;
                    pVar.f5327o = c.getLong(i24);
                    int i25 = i20;
                    int i26 = e23;
                    pVar.f5328p = c.getLong(i26);
                    int i27 = e24;
                    pVar.f5329q = c.getInt(i27) != 0;
                    int i28 = e25;
                    int i29 = i26;
                    pVar.f5330r = C1357v.m7344f(c.getInt(i28));
                    pVar.f5322j = cVar;
                    arrayList.add(pVar);
                    e25 = i28;
                    e2 = i8;
                    e13 = i10;
                    e15 = i12;
                    e16 = i17;
                    e18 = i25;
                    e23 = i29;
                    e9 = i2;
                    e11 = i3;
                    e = i4;
                    e24 = i27;
                    e22 = i24;
                    e3 = i6;
                    int i30 = i21;
                    e20 = i23;
                    e4 = i18;
                    e19 = i30;
                }
                c.close();
                v0Var.mo5622H();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c.close();
                v0Var.mo5622H();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            v0Var = p;
            c.close();
            v0Var.mo5622H();
            throw th;
        }
    }

    /* renamed from: i */
    public void mo6723i(String str, C1236e eVar) {
        this.f5333a.mo5575b();
        C4222f a = this.f5336d.mo5690a();
        byte[] k = C1236e.m6904k(eVar);
        if (k == null) {
            a.mo5561k0(1);
        } else {
            a.mo5558S(1, k);
        }
        if (str == null) {
            a.mo5561k0(2);
        } else {
            a.mo5562r(2, str);
        }
        this.f5333a.mo5576c();
        try {
            a.mo5568u();
            this.f5333a.mo5573C();
        } finally {
            this.f5333a.mo5580g();
            this.f5336d.mo5693f(a);
        }
    }

    /* renamed from: j */
    public List<C1340p> mo6724j() {
        C1008v0 v0Var;
        C1008v0 p = C1008v0.m5896p("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f5333a.mo5575b();
        Cursor c = C0941c.m5704c(this.f5333a, p, false, (CancellationSignal) null);
        try {
            int e = C0940b.m5701e(c, "required_network_type");
            int e2 = C0940b.m5701e(c, "requires_charging");
            int e3 = C0940b.m5701e(c, "requires_device_idle");
            int e4 = C0940b.m5701e(c, "requires_battery_not_low");
            int e5 = C0940b.m5701e(c, "requires_storage_not_low");
            int e6 = C0940b.m5701e(c, "trigger_content_update_delay");
            int e7 = C0940b.m5701e(c, "trigger_max_content_delay");
            int e8 = C0940b.m5701e(c, "content_uri_triggers");
            int e9 = C0940b.m5701e(c, "id");
            int e10 = C0940b.m5701e(c, "state");
            int e11 = C0940b.m5701e(c, "worker_class_name");
            int e12 = C0940b.m5701e(c, "input_merger_class_name");
            int e13 = C0940b.m5701e(c, "input");
            int e14 = C0940b.m5701e(c, "output");
            v0Var = p;
            try {
                int e15 = C0940b.m5701e(c, "initial_delay");
                int e16 = C0940b.m5701e(c, "interval_duration");
                int e17 = C0940b.m5701e(c, "flex_duration");
                int e18 = C0940b.m5701e(c, "run_attempt_count");
                int e19 = C0940b.m5701e(c, "backoff_policy");
                int e20 = C0940b.m5701e(c, "backoff_delay_duration");
                int e21 = C0940b.m5701e(c, "period_start_time");
                int e22 = C0940b.m5701e(c, "minimum_retention_duration");
                int e23 = C0940b.m5701e(c, "schedule_requested_at");
                int e24 = C0940b.m5701e(c, "run_in_foreground");
                int e25 = C0940b.m5701e(c, "out_of_quota_policy");
                int i = e14;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    String string = c.getString(e9);
                    int i2 = e9;
                    String string2 = c.getString(e11);
                    int i3 = e11;
                    C1232c cVar = new C1232c();
                    int i4 = e;
                    cVar.mo6485k(C1357v.m7343e(c.getInt(e)));
                    cVar.mo6487m(c.getInt(e2) != 0);
                    cVar.mo6488n(c.getInt(e3) != 0);
                    cVar.mo6486l(c.getInt(e4) != 0);
                    cVar.mo6489o(c.getInt(e5) != 0);
                    int i5 = e2;
                    int i6 = e3;
                    cVar.mo6490p(c.getLong(e6));
                    cVar.mo6491q(c.getLong(e7));
                    cVar.mo6484j(C1357v.m7340b(c.getBlob(e8)));
                    C1340p pVar = new C1340p(string, string2);
                    pVar.f5314b = C1357v.m7345g(c.getInt(e10));
                    pVar.f5316d = c.getString(e12);
                    pVar.f5317e = C1236e.m6903g(c.getBlob(e13));
                    int i7 = i;
                    pVar.f5318f = C1236e.m6903g(c.getBlob(i7));
                    int i8 = i5;
                    i = i7;
                    int i9 = e15;
                    pVar.f5319g = c.getLong(i9);
                    int i10 = e13;
                    int i11 = e16;
                    pVar.f5320h = c.getLong(i11);
                    int i12 = i9;
                    int i13 = e4;
                    int i14 = e17;
                    pVar.f5321i = c.getLong(i14);
                    int i15 = e18;
                    pVar.f5323k = c.getInt(i15);
                    int i16 = e19;
                    int i17 = i11;
                    pVar.f5324l = C1357v.m7342d(c.getInt(i16));
                    e17 = i14;
                    int i18 = i13;
                    int i19 = e20;
                    pVar.f5325m = c.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = e21;
                    pVar.f5326n = c.getLong(i22);
                    int i23 = i19;
                    e21 = i22;
                    int i24 = e22;
                    pVar.f5327o = c.getLong(i24);
                    int i25 = i20;
                    int i26 = e23;
                    pVar.f5328p = c.getLong(i26);
                    int i27 = e24;
                    pVar.f5329q = c.getInt(i27) != 0;
                    int i28 = e25;
                    int i29 = i26;
                    pVar.f5330r = C1357v.m7344f(c.getInt(i28));
                    pVar.f5322j = cVar;
                    arrayList.add(pVar);
                    e25 = i28;
                    e2 = i8;
                    e13 = i10;
                    e15 = i12;
                    e16 = i17;
                    e18 = i25;
                    e23 = i29;
                    e9 = i2;
                    e11 = i3;
                    e = i4;
                    e24 = i27;
                    e22 = i24;
                    e3 = i6;
                    int i30 = i21;
                    e20 = i23;
                    e4 = i18;
                    e19 = i30;
                }
                c.close();
                v0Var.mo5622H();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c.close();
                v0Var.mo5622H();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            v0Var = p;
            c.close();
            v0Var.mo5622H();
            throw th;
        }
    }

    /* renamed from: k */
    public boolean mo6725k() {
        boolean z = false;
        C1008v0 p = C1008v0.m5896p("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f5333a.mo5575b();
        Cursor c = C0941c.m5704c(this.f5333a, p, false, (CancellationSignal) null);
        try {
            if (c.moveToFirst() && c.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            c.close();
            p.mo5622H();
        }
    }

    /* renamed from: l */
    public List<String> mo6726l(String str) {
        C1008v0 p = C1008v0.m5896p("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            p.mo5561k0(1);
        } else {
            p.mo5562r(1, str);
        }
        this.f5333a.mo5575b();
        Cursor c = C0941c.m5704c(this.f5333a, p, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                arrayList.add(c.getString(0));
            }
            return arrayList;
        } finally {
            c.close();
            p.mo5622H();
        }
    }

    /* renamed from: m */
    public C1421u mo6727m(String str) {
        C1008v0 p = C1008v0.m5896p("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            p.mo5561k0(1);
        } else {
            p.mo5562r(1, str);
        }
        this.f5333a.mo5575b();
        C1421u uVar = null;
        Cursor c = C0941c.m5704c(this.f5333a, p, false, (CancellationSignal) null);
        try {
            if (c.moveToFirst()) {
                uVar = C1357v.m7345g(c.getInt(0));
            }
            return uVar;
        } finally {
            c.close();
            p.mo5622H();
        }
    }

    /* renamed from: n */
    public C1340p mo6728n(String str) {
        C1008v0 v0Var;
        C1340p pVar;
        String str2 = str;
        C1008v0 p = C1008v0.m5896p("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            p.mo5561k0(1);
        } else {
            p.mo5562r(1, str2);
        }
        this.f5333a.mo5575b();
        Cursor c = C0941c.m5704c(this.f5333a, p, false, (CancellationSignal) null);
        try {
            int e = C0940b.m5701e(c, "required_network_type");
            int e2 = C0940b.m5701e(c, "requires_charging");
            int e3 = C0940b.m5701e(c, "requires_device_idle");
            int e4 = C0940b.m5701e(c, "requires_battery_not_low");
            int e5 = C0940b.m5701e(c, "requires_storage_not_low");
            int e6 = C0940b.m5701e(c, "trigger_content_update_delay");
            int e7 = C0940b.m5701e(c, "trigger_max_content_delay");
            int e8 = C0940b.m5701e(c, "content_uri_triggers");
            int e9 = C0940b.m5701e(c, "id");
            int e10 = C0940b.m5701e(c, "state");
            int e11 = C0940b.m5701e(c, "worker_class_name");
            int e12 = C0940b.m5701e(c, "input_merger_class_name");
            int e13 = C0940b.m5701e(c, "input");
            int e14 = C0940b.m5701e(c, "output");
            v0Var = p;
            try {
                int e15 = C0940b.m5701e(c, "initial_delay");
                int e16 = C0940b.m5701e(c, "interval_duration");
                int e17 = C0940b.m5701e(c, "flex_duration");
                int e18 = C0940b.m5701e(c, "run_attempt_count");
                int e19 = C0940b.m5701e(c, "backoff_policy");
                int e20 = C0940b.m5701e(c, "backoff_delay_duration");
                int e21 = C0940b.m5701e(c, "period_start_time");
                int e22 = C0940b.m5701e(c, "minimum_retention_duration");
                int e23 = C0940b.m5701e(c, "schedule_requested_at");
                int e24 = C0940b.m5701e(c, "run_in_foreground");
                int e25 = C0940b.m5701e(c, "out_of_quota_policy");
                if (c.moveToFirst()) {
                    String string = c.getString(e9);
                    String string2 = c.getString(e11);
                    int i = e25;
                    C1232c cVar = new C1232c();
                    cVar.mo6485k(C1357v.m7343e(c.getInt(e)));
                    cVar.mo6487m(c.getInt(e2) != 0);
                    cVar.mo6488n(c.getInt(e3) != 0);
                    cVar.mo6486l(c.getInt(e4) != 0);
                    cVar.mo6489o(c.getInt(e5) != 0);
                    cVar.mo6490p(c.getLong(e6));
                    cVar.mo6491q(c.getLong(e7));
                    cVar.mo6484j(C1357v.m7340b(c.getBlob(e8)));
                    C1340p pVar2 = new C1340p(string, string2);
                    pVar2.f5314b = C1357v.m7345g(c.getInt(e10));
                    pVar2.f5316d = c.getString(e12);
                    pVar2.f5317e = C1236e.m6903g(c.getBlob(e13));
                    pVar2.f5318f = C1236e.m6903g(c.getBlob(e14));
                    pVar2.f5319g = c.getLong(e15);
                    pVar2.f5320h = c.getLong(e16);
                    pVar2.f5321i = c.getLong(e17);
                    pVar2.f5323k = c.getInt(e18);
                    pVar2.f5324l = C1357v.m7342d(c.getInt(e19));
                    pVar2.f5325m = c.getLong(e20);
                    pVar2.f5326n = c.getLong(e21);
                    pVar2.f5327o = c.getLong(e22);
                    pVar2.f5328p = c.getLong(e23);
                    pVar2.f5329q = c.getInt(e24) != 0;
                    pVar2.f5330r = C1357v.m7344f(c.getInt(i));
                    pVar2.f5322j = cVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                c.close();
                v0Var.mo5622H();
                return pVar;
            } catch (Throwable th) {
                th = th;
                c.close();
                v0Var.mo5622H();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            v0Var = p;
            c.close();
            v0Var.mo5622H();
            throw th;
        }
    }

    /* renamed from: o */
    public int mo6729o(String str) {
        this.f5333a.mo5575b();
        C4222f a = this.f5339g.mo5690a();
        if (str == null) {
            a.mo5561k0(1);
        } else {
            a.mo5562r(1, str);
        }
        this.f5333a.mo5576c();
        try {
            int u = a.mo5568u();
            this.f5333a.mo5573C();
            return u;
        } finally {
            this.f5333a.mo5580g();
            this.f5339g.mo5693f(a);
        }
    }

    /* renamed from: p */
    public List<String> mo6730p(String str) {
        C1008v0 p = C1008v0.m5896p("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            p.mo5561k0(1);
        } else {
            p.mo5562r(1, str);
        }
        this.f5333a.mo5575b();
        Cursor c = C0941c.m5704c(this.f5333a, p, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                arrayList.add(c.getString(0));
            }
            return arrayList;
        } finally {
            c.close();
            p.mo5622H();
        }
    }

    /* renamed from: q */
    public List<C1236e> mo6731q(String str) {
        C1008v0 p = C1008v0.m5896p("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            p.mo5561k0(1);
        } else {
            p.mo5562r(1, str);
        }
        this.f5333a.mo5575b();
        Cursor c = C0941c.m5704c(this.f5333a, p, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                arrayList.add(C1236e.m6903g(c.getBlob(0)));
            }
            return arrayList;
        } finally {
            c.close();
            p.mo5622H();
        }
    }

    /* renamed from: r */
    public int mo6732r(String str) {
        this.f5333a.mo5575b();
        C4222f a = this.f5338f.mo5690a();
        if (str == null) {
            a.mo5561k0(1);
        } else {
            a.mo5562r(1, str);
        }
        this.f5333a.mo5576c();
        try {
            int u = a.mo5568u();
            this.f5333a.mo5573C();
            return u;
        } finally {
            this.f5333a.mo5580g();
            this.f5338f.mo5693f(a);
        }
    }

    /* renamed from: s */
    public void mo6733s(String str, long j) {
        this.f5333a.mo5575b();
        C4222f a = this.f5337e.mo5690a();
        a.mo5557L(1, j);
        if (str == null) {
            a.mo5561k0(2);
        } else {
            a.mo5562r(2, str);
        }
        this.f5333a.mo5576c();
        try {
            a.mo5568u();
            this.f5333a.mo5573C();
        } finally {
            this.f5333a.mo5580g();
            this.f5337e.mo5693f(a);
        }
    }

    /* renamed from: t */
    public List<C1340p> mo6734t(int i) {
        C1008v0 v0Var;
        C1008v0 p = C1008v0.m5896p("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        p.mo5557L(1, (long) i);
        this.f5333a.mo5575b();
        Cursor c = C0941c.m5704c(this.f5333a, p, false, (CancellationSignal) null);
        try {
            int e = C0940b.m5701e(c, "required_network_type");
            int e2 = C0940b.m5701e(c, "requires_charging");
            int e3 = C0940b.m5701e(c, "requires_device_idle");
            int e4 = C0940b.m5701e(c, "requires_battery_not_low");
            int e5 = C0940b.m5701e(c, "requires_storage_not_low");
            int e6 = C0940b.m5701e(c, "trigger_content_update_delay");
            int e7 = C0940b.m5701e(c, "trigger_max_content_delay");
            int e8 = C0940b.m5701e(c, "content_uri_triggers");
            int e9 = C0940b.m5701e(c, "id");
            int e10 = C0940b.m5701e(c, "state");
            int e11 = C0940b.m5701e(c, "worker_class_name");
            int e12 = C0940b.m5701e(c, "input_merger_class_name");
            int e13 = C0940b.m5701e(c, "input");
            int e14 = C0940b.m5701e(c, "output");
            v0Var = p;
            try {
                int e15 = C0940b.m5701e(c, "initial_delay");
                int e16 = C0940b.m5701e(c, "interval_duration");
                int e17 = C0940b.m5701e(c, "flex_duration");
                int e18 = C0940b.m5701e(c, "run_attempt_count");
                int e19 = C0940b.m5701e(c, "backoff_policy");
                int e20 = C0940b.m5701e(c, "backoff_delay_duration");
                int e21 = C0940b.m5701e(c, "period_start_time");
                int e22 = C0940b.m5701e(c, "minimum_retention_duration");
                int e23 = C0940b.m5701e(c, "schedule_requested_at");
                int e24 = C0940b.m5701e(c, "run_in_foreground");
                int e25 = C0940b.m5701e(c, "out_of_quota_policy");
                int i2 = e14;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    String string = c.getString(e9);
                    int i3 = e9;
                    String string2 = c.getString(e11);
                    int i4 = e11;
                    C1232c cVar = new C1232c();
                    int i5 = e;
                    cVar.mo6485k(C1357v.m7343e(c.getInt(e)));
                    cVar.mo6487m(c.getInt(e2) != 0);
                    cVar.mo6488n(c.getInt(e3) != 0);
                    cVar.mo6486l(c.getInt(e4) != 0);
                    cVar.mo6489o(c.getInt(e5) != 0);
                    int i6 = e2;
                    int i7 = e3;
                    cVar.mo6490p(c.getLong(e6));
                    cVar.mo6491q(c.getLong(e7));
                    cVar.mo6484j(C1357v.m7340b(c.getBlob(e8)));
                    C1340p pVar = new C1340p(string, string2);
                    pVar.f5314b = C1357v.m7345g(c.getInt(e10));
                    pVar.f5316d = c.getString(e12);
                    pVar.f5317e = C1236e.m6903g(c.getBlob(e13));
                    int i8 = i2;
                    pVar.f5318f = C1236e.m6903g(c.getBlob(i8));
                    int i9 = i6;
                    i2 = i8;
                    int i10 = e15;
                    pVar.f5319g = c.getLong(i10);
                    int i11 = e12;
                    int i12 = e16;
                    pVar.f5320h = c.getLong(i12);
                    int i13 = i10;
                    int i14 = e4;
                    int i15 = e17;
                    pVar.f5321i = c.getLong(i15);
                    int i16 = e18;
                    pVar.f5323k = c.getInt(i16);
                    int i17 = e19;
                    int i18 = i12;
                    pVar.f5324l = C1357v.m7342d(c.getInt(i17));
                    e17 = i15;
                    int i19 = i14;
                    int i20 = e20;
                    pVar.f5325m = c.getLong(i20);
                    int i21 = i16;
                    int i22 = i17;
                    int i23 = e21;
                    pVar.f5326n = c.getLong(i23);
                    int i24 = i20;
                    e21 = i23;
                    int i25 = e22;
                    pVar.f5327o = c.getLong(i25);
                    int i26 = i21;
                    int i27 = e23;
                    pVar.f5328p = c.getLong(i27);
                    int i28 = e24;
                    pVar.f5329q = c.getInt(i28) != 0;
                    int i29 = e25;
                    int i30 = i27;
                    pVar.f5330r = C1357v.m7344f(c.getInt(i29));
                    pVar.f5322j = cVar;
                    arrayList.add(pVar);
                    e25 = i29;
                    e2 = i9;
                    e12 = i11;
                    e15 = i13;
                    e16 = i18;
                    e18 = i26;
                    e23 = i30;
                    e9 = i3;
                    e11 = i4;
                    e = i5;
                    e24 = i28;
                    e22 = i25;
                    e3 = i7;
                    int i31 = i22;
                    e20 = i24;
                    e4 = i19;
                    e19 = i31;
                }
                c.close();
                v0Var.mo5622H();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c.close();
                v0Var.mo5622H();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            v0Var = p;
            c.close();
            v0Var.mo5622H();
            throw th;
        }
    }

    /* renamed from: u */
    public int mo6735u() {
        this.f5333a.mo5575b();
        C4222f a = this.f5341i.mo5690a();
        this.f5333a.mo5576c();
        try {
            int u = a.mo5568u();
            this.f5333a.mo5573C();
            return u;
        } finally {
            this.f5333a.mo5580g();
            this.f5341i.mo5693f(a);
        }
    }
}
