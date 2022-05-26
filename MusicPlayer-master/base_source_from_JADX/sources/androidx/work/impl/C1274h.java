package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.room.p005c1.C0936a;
import androidx.work.impl.utils.C1364c;
import androidx.work.impl.utils.C1366e;
import p082e.p149u.p150a.C4214b;

/* renamed from: androidx.work.impl.h */
/* compiled from: WorkDatabaseMigrations */
public class C1274h {

    /* renamed from: a */
    public static C0936a f5178a = new C1275a(1, 2);

    /* renamed from: b */
    public static C0936a f5179b = new C1276b(3, 4);

    /* renamed from: c */
    public static C0936a f5180c = new C1277c(4, 5);

    /* renamed from: d */
    public static C0936a f5181d = new C1278d(6, 7);

    /* renamed from: e */
    public static C0936a f5182e = new C1279e(7, 8);

    /* renamed from: f */
    public static C0936a f5183f = new C1280f(8, 9);

    /* renamed from: g */
    public static C0936a f5184g = new C1281g(11, 12);

    /* renamed from: androidx.work.impl.h$a */
    /* compiled from: WorkDatabaseMigrations */
    class C1275a extends C0936a {
        C1275a(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo5455a(C4214b bVar) {
            bVar.mo5543q("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo5543q("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.mo5543q("DROP TABLE IF EXISTS alarmInfo");
            bVar.mo5543q("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: androidx.work.impl.h$b */
    /* compiled from: WorkDatabaseMigrations */
    class C1276b extends C0936a {
        C1276b(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo5455a(C4214b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.mo5543q("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* renamed from: androidx.work.impl.h$c */
    /* compiled from: WorkDatabaseMigrations */
    class C1277c extends C0936a {
        C1277c(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo5455a(C4214b bVar) {
            bVar.mo5543q("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.mo5543q("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: androidx.work.impl.h$d */
    /* compiled from: WorkDatabaseMigrations */
    class C1278d extends C0936a {
        C1278d(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo5455a(C4214b bVar) {
            bVar.mo5543q("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* renamed from: androidx.work.impl.h$e */
    /* compiled from: WorkDatabaseMigrations */
    class C1279e extends C0936a {
        C1279e(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo5455a(C4214b bVar) {
            bVar.mo5543q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* renamed from: androidx.work.impl.h$f */
    /* compiled from: WorkDatabaseMigrations */
    class C1280f extends C0936a {
        C1280f(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo5455a(C4214b bVar) {
            bVar.mo5543q("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.h$g */
    /* compiled from: WorkDatabaseMigrations */
    class C1281g extends C0936a {
        C1281g(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo5455a(C4214b bVar) {
            bVar.mo5543q("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.h$h */
    /* compiled from: WorkDatabaseMigrations */
    public static class C1282h extends C0936a {

        /* renamed from: c */
        final Context f5185c;

        public C1282h(Context context, int i, int i2) {
            super(i, i2);
            this.f5185c = context;
        }

        /* renamed from: a */
        public void mo5455a(C4214b bVar) {
            if (this.f4090b >= 10) {
                bVar.mo5528N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                return;
            }
            this.f5185c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }

    /* renamed from: androidx.work.impl.h$i */
    /* compiled from: WorkDatabaseMigrations */
    public static class C1283i extends C0936a {

        /* renamed from: c */
        final Context f5186c;

        public C1283i(Context context) {
            super(9, 10);
            this.f5186c = context;
        }

        /* renamed from: a */
        public void mo5455a(C4214b bVar) {
            bVar.mo5543q("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            C1366e.m7383b(this.f5186c, bVar);
            C1364c.m7377a(this.f5186c, bVar);
        }
    }
}
