package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3024o1;
import java.util.ArrayList;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p12 {

    /* renamed from: a */
    private final C5790yp f21281a;

    /* renamed from: b */
    private final Context f21282b;

    /* renamed from: c */
    private final x02 f21283c;

    /* renamed from: d */
    private final zzcjf f21284d;

    /* renamed from: e */
    private final String f21285e;

    /* renamed from: f */
    private final gu2 f21286f;

    /* renamed from: g */
    private final C3024o1 f21287g = C2971s.m13213p().mo17562h();

    public p12(Context context, zzcjf zzcjf, C5790yp ypVar, x02 x02, String str, gu2 gu2) {
        this.f21282b = context;
        this.f21284d = zzcjf;
        this.f21281a = ypVar;
        this.f21283c = x02;
        this.f21285e = str;
        this.f21286f = gu2;
    }

    /* renamed from: c */
    private static final void m28825c(SQLiteDatabase sQLiteDatabase, ArrayList<C5014ds> arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C5014ds dsVar = arrayList.get(i);
            if (dsVar.mo17011b0() == 2 && dsVar.mo17004I() > j) {
                j = dsVar.mo17004I();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo20177a(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        if (z) {
            this.f21282b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        int i = 2;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22352I5)).booleanValue()) {
            fu2 b = fu2.m23966b("oa_upload");
            b.mo17738a("oa_failed_reqs", String.valueOf(k12.m26062a(sQLiteDatabase2, 0)));
            b.mo17738a("oa_total_reqs", String.valueOf(k12.m26062a(sQLiteDatabase2, 1)));
            b.mo17738a("oa_upload_time", String.valueOf(C2971s.m13198a().mo11988a()));
            b.mo17738a("oa_last_successful_time", String.valueOf(k12.m26063b(sQLiteDatabase2, 2)));
            b.mo17738a("oa_session_id", this.f21287g.mo11065E() ? BuildConfig.FLAVOR : this.f21285e);
            this.f21286f.mo18029a(b);
            ArrayList<C5014ds> c = k12.m26064c(sQLiteDatabase);
            m28825c(sQLiteDatabase2, c);
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C5014ds dsVar = c.get(i2);
                fu2 b2 = fu2.m23966b("oa_signals");
                b2.mo17738a("oa_session_id", this.f21287g.mo11065E() ? BuildConfig.FLAVOR : this.f21285e);
                C5792yr J = dsVar.mo17005J();
                String valueOf = J.mo22281H() ? String.valueOf(J.mo22283J() - 1) : "-1";
                String obj = z43.m34425b(dsVar.mo17007O(), o12.f20862a).toString();
                b2.mo17738a("oa_sig_ts", String.valueOf(dsVar.mo17004I()));
                b2.mo17738a("oa_sig_status", String.valueOf(dsVar.mo17011b0() - 1));
                b2.mo17738a("oa_sig_resp_lat", String.valueOf(dsVar.mo17003H()));
                b2.mo17738a("oa_sig_render_lat", String.valueOf(dsVar.mo17002G()));
                b2.mo17738a("oa_sig_formats", obj);
                b2.mo17738a("oa_sig_nw_type", valueOf);
                b2.mo17738a("oa_sig_wifi", String.valueOf(dsVar.mo17012c0() - 1));
                b2.mo17738a("oa_sig_airplane", String.valueOf(dsVar.mo17008X() - 1));
                b2.mo17738a("oa_sig_data", String.valueOf(dsVar.mo17009Z() - 1));
                b2.mo17738a("oa_sig_nw_resp", String.valueOf(dsVar.mo17001F()));
                b2.mo17738a("oa_sig_offline", String.valueOf(dsVar.mo17010a0() - 1));
                b2.mo17738a("oa_sig_nw_state", String.valueOf(dsVar.mo17006N().zza()));
                if (J.mo22280G() && J.mo22281H() && J.mo22283J() == 2) {
                    b2.mo17738a("oa_sig_cell_type", String.valueOf(J.mo22282I() - 1));
                }
                this.f21286f.mo18029a(b2);
            }
        } else {
            ArrayList<C5014ds> c2 = k12.m26064c(sQLiteDatabase);
            C5051es D = C5163hs.m24899D();
            D.mo17283s(this.f21282b.getPackageName());
            D.mo17284t(Build.MODEL);
            D.mo17285u(k12.m26062a(sQLiteDatabase2, 0));
            D.mo17282r(c2);
            D.mo17287w(k12.m26062a(sQLiteDatabase2, 1));
            D.mo17288y(C2971s.m13198a().mo11988a());
            D.mo17286v(k12.m26063b(sQLiteDatabase2, 2));
            m28825c(sQLiteDatabase2, c2);
            this.f21281a.mo22272b(new l12((C5163hs) D.mo19761n()));
            C5570ss D2 = C5607ts.m31455D();
            D2.mo20955r(this.f21284d.f27377h);
            D2.mo20957t(this.f21284d.f27378i);
            if (true == this.f21284d.f27379j) {
                i = 0;
            }
            D2.mo20956s(i);
            this.f21281a.mo22272b(new m12((C5607ts) D2.mo19761n()));
            this.f21281a.mo22273c(10004);
        }
        sQLiteDatabase2.delete("offline_signal_contents", (String) null, (String[]) null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", 0);
        sQLiteDatabase2.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("value", 0);
        sQLiteDatabase2.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }

    /* renamed from: b */
    public final void mo20178b(boolean z) {
        try {
            this.f21283c.mo21950a(new n12(this, z));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            ul0.m31859d(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }
}
