package androidx.work.impl;

import androidx.room.C0938d0;
import androidx.room.C0967k0;
import androidx.room.C0994s0;
import androidx.room.C1004u0;
import androidx.room.p006d1.C0941c;
import androidx.room.p006d1.C0945g;
import androidx.work.impl.p012n.C1318b;
import androidx.work.impl.p012n.C1319c;
import androidx.work.impl.p012n.C1322e;
import androidx.work.impl.p012n.C1323f;
import androidx.work.impl.p012n.C1326h;
import androidx.work.impl.p012n.C1327i;
import androidx.work.impl.p012n.C1331k;
import androidx.work.impl.p012n.C1332l;
import androidx.work.impl.p012n.C1335n;
import androidx.work.impl.p012n.C1336o;
import androidx.work.impl.p012n.C1342q;
import androidx.work.impl.p012n.C1343r;
import androidx.work.impl.p012n.C1354t;
import androidx.work.impl.p012n.C1355u;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p082e.p149u.p150a.C4214b;
import p082e.p149u.p150a.C4215c;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: o */
    private volatile C1342q f5054o;

    /* renamed from: p */
    private volatile C1318b f5055p;

    /* renamed from: q */
    private volatile C1354t f5056q;

    /* renamed from: r */
    private volatile C1326h f5057r;

    /* renamed from: s */
    private volatile C1331k f5058s;

    /* renamed from: t */
    private volatile C1335n f5059t;

    /* renamed from: u */
    private volatile C1322e f5060u;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    class C1244a extends C1004u0.C1005a {
        C1244a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo5615a(C4214b bVar) {
            bVar.mo5543q("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo5543q("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.mo5543q("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.mo5543q("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            bVar.mo5543q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.mo5543q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            bVar.mo5543q("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo5543q("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.mo5543q("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo5543q("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo5543q("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.mo5543q("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo5543q("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bVar.mo5543q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.mo5543q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        /* renamed from: b */
        public void mo5616b(C4214b bVar) {
            bVar.mo5543q("DROP TABLE IF EXISTS `Dependency`");
            bVar.mo5543q("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.mo5543q("DROP TABLE IF EXISTS `WorkTag`");
            bVar.mo5543q("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.mo5543q("DROP TABLE IF EXISTS `WorkName`");
            bVar.mo5543q("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.mo5543q("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f4233h != null) {
                int size = WorkDatabase_Impl.this.f4233h.size();
                for (int i = 0; i < size; i++) {
                    ((C0994s0.C0996b) WorkDatabase_Impl.this.f4233h.get(i)).mo5603b(bVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo5617c(C4214b bVar) {
            if (WorkDatabase_Impl.this.f4233h != null) {
                int size = WorkDatabase_Impl.this.f4233h.size();
                for (int i = 0; i < size; i++) {
                    ((C0994s0.C0996b) WorkDatabase_Impl.this.f4233h.get(i)).mo5602a(bVar);
                }
            }
        }

        /* renamed from: d */
        public void mo5618d(C4214b bVar) {
            C4214b unused = WorkDatabase_Impl.this.f4226a = bVar;
            bVar.mo5543q("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.mo5590s(bVar);
            if (WorkDatabase_Impl.this.f4233h != null) {
                int size = WorkDatabase_Impl.this.f4233h.size();
                for (int i = 0; i < size; i++) {
                    ((C0994s0.C0996b) WorkDatabase_Impl.this.f4233h.get(i)).mo5604c(bVar);
                }
            }
        }

        /* renamed from: e */
        public void mo5619e(C4214b bVar) {
        }

        /* renamed from: f */
        public void mo5620f(C4214b bVar) {
            C0941c.m5703b(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C1004u0.C1006b mo5621g(C4214b bVar) {
            C4214b bVar2 = bVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C0945g.C0946a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new C0945g.C0946a("prerequisite_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C0945g.C0947b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new C0945g.C0947b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C0945g.C0949d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            hashSet2.add(new C0945g.C0949d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"})));
            C0945g gVar = new C0945g("Dependency", hashMap, hashSet, hashSet2);
            C0945g a = C0945g.m5711a(bVar2, "Dependency");
            if (!gVar.equals(a)) {
                return new C1004u0.C1006b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new C0945g.C0946a("id", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("state", new C0945g.C0946a("state", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new C0945g.C0946a("worker_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new C0945g.C0946a("input_merger_class_name", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("input", new C0945g.C0946a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new C0945g.C0946a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new C0945g.C0946a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new C0945g.C0946a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new C0945g.C0946a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new C0945g.C0946a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new C0945g.C0946a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new C0945g.C0946a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_start_time", new C0945g.C0946a("period_start_time", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("minimum_retention_duration", new C0945g.C0946a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new C0945g.C0946a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new C0945g.C0946a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new C0945g.C0946a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("required_network_type", new C0945g.C0946a("required_network_type", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("requires_charging", new C0945g.C0946a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new C0945g.C0946a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new C0945g.C0946a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new C0945g.C0946a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new C0945g.C0946a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new C0945g.C0946a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new C0945g.C0946a("content_uri_triggers", "BLOB", false, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C0945g.C0949d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"})));
            hashSet4.add(new C0945g.C0949d("index_WorkSpec_period_start_time", false, Arrays.asList(new String[]{"period_start_time"})));
            C0945g gVar2 = new C0945g("WorkSpec", hashMap2, hashSet3, hashSet4);
            C0945g a2 = C0945g.m5711a(bVar2, "WorkSpec");
            if (!gVar2.equals(a2)) {
                return new C1004u0.C1006b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gVar2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C0945g.C0946a("tag", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new C0945g.C0946a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C0945g.C0947b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C0945g.C0949d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            C0945g gVar3 = new C0945g("WorkTag", hashMap3, hashSet5, hashSet6);
            C0945g a3 = C0945g.m5711a(bVar2, "WorkTag");
            if (!gVar3.equals(a3)) {
                return new C1004u0.C1006b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gVar3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new C0945g.C0946a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("system_id", new C0945g.C0946a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C0945g.C0947b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C0945g gVar4 = new C0945g("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C0945g a4 = C0945g.m5711a(bVar2, "SystemIdInfo");
            if (!gVar4.equals(a4)) {
                return new C1004u0.C1006b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gVar4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new C0945g.C0946a("name", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new C0945g.C0946a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C0945g.C0947b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C0945g.C0949d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            C0945g gVar5 = new C0945g("WorkName", hashMap5, hashSet8, hashSet9);
            C0945g a5 = C0945g.m5711a(bVar2, "WorkName");
            if (!gVar5.equals(a5)) {
                return new C1004u0.C1006b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gVar5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C0945g.C0946a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("progress", new C0945g.C0946a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C0945g.C0947b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C0945g gVar6 = new C0945g("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C0945g a6 = C0945g.m5711a(bVar2, "WorkProgress");
            if (!gVar6.equals(a6)) {
                return new C1004u0.C1006b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + gVar6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new C0945g.C0946a("key", "TEXT", true, 1, (String) null, 1));
            hashMap7.put("long_value", new C0945g.C0946a("long_value", "INTEGER", false, 0, (String) null, 1));
            C0945g gVar7 = new C0945g("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C0945g a7 = C0945g.m5711a(bVar2, "Preference");
            if (gVar7.equals(a7)) {
                return new C1004u0.C1006b(true, (String) null);
            }
            return new C1004u0.C1006b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + gVar7 + "\n Found:\n" + a7);
        }
    }

    /* renamed from: F */
    public C1318b mo6522F() {
        C1318b bVar;
        if (this.f5055p != null) {
            return this.f5055p;
        }
        synchronized (this) {
            if (this.f5055p == null) {
                this.f5055p = new C1319c(this);
            }
            bVar = this.f5055p;
        }
        return bVar;
    }

    /* renamed from: J */
    public C1322e mo6523J() {
        C1322e eVar;
        if (this.f5060u != null) {
            return this.f5060u;
        }
        synchronized (this) {
            if (this.f5060u == null) {
                this.f5060u = new C1323f(this);
            }
            eVar = this.f5060u;
        }
        return eVar;
    }

    /* renamed from: K */
    public C1326h mo6524K() {
        C1326h hVar;
        if (this.f5057r != null) {
            return this.f5057r;
        }
        synchronized (this) {
            if (this.f5057r == null) {
                this.f5057r = new C1327i(this);
            }
            hVar = this.f5057r;
        }
        return hVar;
    }

    /* renamed from: L */
    public C1331k mo6525L() {
        C1331k kVar;
        if (this.f5058s != null) {
            return this.f5058s;
        }
        synchronized (this) {
            if (this.f5058s == null) {
                this.f5058s = new C1332l(this);
            }
            kVar = this.f5058s;
        }
        return kVar;
    }

    /* renamed from: M */
    public C1335n mo6526M() {
        C1335n nVar;
        if (this.f5059t != null) {
            return this.f5059t;
        }
        synchronized (this) {
            if (this.f5059t == null) {
                this.f5059t = new C1336o(this);
            }
            nVar = this.f5059t;
        }
        return nVar;
    }

    /* renamed from: N */
    public C1342q mo6527N() {
        C1342q qVar;
        if (this.f5054o != null) {
            return this.f5054o;
        }
        synchronized (this) {
            if (this.f5054o == null) {
                this.f5054o = new C1343r(this);
            }
            qVar = this.f5054o;
        }
        return qVar;
    }

    /* renamed from: O */
    public C1354t mo6528O() {
        C1354t tVar;
        if (this.f5056q != null) {
            return this.f5056q;
        }
        synchronized (this) {
            if (this.f5056q == null) {
                this.f5056q = new C1355u(this);
            }
            tVar = this.f5056q;
        }
        return tVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0967k0 mo5578e() {
        return new C0967k0(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C4215c mo5579f(C0938d0 d0Var) {
        C1004u0 u0Var = new C1004u0(d0Var, new C1244a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        C4215c.C4217b.C4218a a = C4215c.C4217b.m18575a(d0Var.f4093b);
        a.mo14408c(d0Var.f4094c);
        a.mo14407b(u0Var);
        return d0Var.f4092a.mo5440a(a.mo14406a());
    }
}
