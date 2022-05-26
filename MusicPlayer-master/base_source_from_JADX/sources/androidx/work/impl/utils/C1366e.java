package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p012n.C1321d;
import p082e.p149u.p150a.C4214b;

/* renamed from: androidx.work.impl.utils.e */
/* compiled from: PreferenceUtils */
public class C1366e {

    /* renamed from: a */
    private final WorkDatabase f5369a;

    public C1366e(WorkDatabase workDatabase) {
        this.f5369a = workDatabase;
    }

    /* renamed from: b */
    public static void m7383b(Context context, C4214b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = 0;
            long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j = 1;
            }
            bVar.mo5539m();
            try {
                bVar.mo5528N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                bVar.mo5528N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                sharedPreferences.edit().clear().apply();
                bVar.mo5527M();
            } finally {
                bVar.mo5533a0();
            }
        }
    }

    /* renamed from: a */
    public boolean mo6759a() {
        Long a = this.f5369a.mo6523J().mo6689a("reschedule_needed");
        return a != null && a.longValue() == 1;
    }

    /* renamed from: c */
    public void mo6760c(boolean z) {
        this.f5369a.mo6523J().mo6690b(new C1321d("reschedule_needed", z));
    }
}
