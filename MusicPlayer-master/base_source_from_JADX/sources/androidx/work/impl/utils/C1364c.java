package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p012n.C1321d;
import p082e.p149u.p150a.C4214b;

/* renamed from: androidx.work.impl.utils.c */
/* compiled from: IdGenerator */
public class C1364c {

    /* renamed from: a */
    private final WorkDatabase f5367a;

    public C1364c(WorkDatabase workDatabase) {
        this.f5367a = workDatabase;
    }

    /* renamed from: a */
    public static void m7377a(Context context, C4214b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            bVar.mo5539m();
            try {
                bVar.mo5528N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                bVar.mo5528N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                bVar.mo5527M();
            } finally {
                bVar.mo5533a0();
            }
        }
    }

    /* renamed from: c */
    private int m7378c(String str) {
        this.f5367a.mo5576c();
        try {
            Long a = this.f5367a.mo6523J().mo6689a(str);
            int i = 0;
            int intValue = a != null ? a.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            m7379e(str, i);
            this.f5367a.mo5573C();
            return intValue;
        } finally {
            this.f5367a.mo5580g();
        }
    }

    /* renamed from: e */
    private void m7379e(String str, int i) {
        this.f5367a.mo6523J().mo6690b(new C1321d(str, (long) i));
    }

    /* renamed from: b */
    public int mo6757b() {
        int c;
        synchronized (C1364c.class) {
            c = m7378c("next_alarm_manager_id");
        }
        return c;
    }

    /* renamed from: d */
    public int mo6758d(int i, int i2) {
        synchronized (C1364c.class) {
            int c = m7378c("next_job_scheduler_id");
            if (c >= i) {
                if (c <= i2) {
                    i = c;
                }
            }
            m7379e("next_job_scheduler_id", i + 1);
        }
        return i;
    }
}
