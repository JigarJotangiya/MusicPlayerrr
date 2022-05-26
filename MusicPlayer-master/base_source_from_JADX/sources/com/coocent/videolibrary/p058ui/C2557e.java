package com.coocent.videolibrary.p058ui;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.core.app.C0466a;
import androidx.fragment.app.C0602j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0703o0;
import androidx.lifecycle.C0712q0;
import p159f.p166c.p224o.p226l.C4658h;
import p159f.p166c.p224o.p226l.C4667p;
import p159f.p166c.p224o.p226l.C4668q;
import p159f.p166c.p224o.p227m.C4680h;
import p159f.p166c.p224o.p227m.C4681i;
import p159f.p166c.p224o.p228n.p230c.C4736s;
import p159f.p166c.p224o.p228n.p230c.C4745t;
import p159f.p166c.p231p.p234c.C4814m;
import p159f.p166c.p231p.p234c.C4815n;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.videolibrary.ui.e */
/* compiled from: BaseFragment.kt */
public class C2557e extends Fragment {

    /* renamed from: d0 */
    private C4815n f8968d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public C4681i f8969e0;

    /* renamed from: f0 */
    private boolean f8970f0;

    /* renamed from: g0 */
    private final String f8971g0 = "isNight";

    /* renamed from: com.coocent.videolibrary.ui.e$a */
    /* compiled from: BaseFragment.kt */
    public static final class C2558a implements C4745t<Integer> {

        /* renamed from: a */
        final /* synthetic */ C2557e f8972a;

        C2558a(C2557e eVar) {
            this.f8972a = eVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10036a(Object obj) {
            mo10051b(((Number) obj).intValue());
        }

        /* renamed from: b */
        public void mo10051b(int i) {
            if (i == 1) {
                Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", this.f8972a.mo3705u2().getPackageName(), (String) null));
                C8594l.m46770d(data, "Intent(Settings.ACTION_A…ity().packageName, null))");
                data.addFlags(268435456);
                this.f8972a.mo3627R2(data);
                return;
            }
            C4681i X2 = this.f8972a.f8969e0;
            if (X2 != null) {
                X2.mo15406D(false);
                C4681i X22 = this.f8972a.f8969e0;
                if (X22 != null) {
                    X22.mo15410H(true);
                    this.f8972a.mo10049b3(false);
                    return;
                }
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
    }

    /* renamed from: c3 */
    private final void m11790c3() {
        C4681i iVar = this.f8969e0;
        if (iVar != null) {
            iVar.mo15406D(false);
            C4681i iVar2 = this.f8969e0;
            if (iVar2 != null) {
                iVar2.mo15409G(true);
                C4681i iVar3 = this.f8969e0;
                if (iVar3 != null) {
                    iVar3.mo15410H(false);
                    if (C4658h.m20159a() >= 5242880) {
                        C4815n nVar = this.f8968d0;
                        if (nVar != null) {
                            nVar.mo15543S();
                            mo10049b3(true);
                            return;
                        }
                        C8594l.m46783q("mVideoStoreViewModel");
                        throw null;
                    }
                    mo10049b3(false);
                    Toast.makeText(mo3708v2(), "Internal storage has not enough space", 0).show();
                    return;
                }
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
        C8594l.m46783q("mVideoLibraryViewModel");
        throw null;
    }

    /* renamed from: e3 */
    private final void m11791e3() {
        FragmentActivity u2 = mo3705u2();
        Application application = mo3705u2().getApplication();
        C8594l.m46770d(application, "requireActivity().application");
        C0696m0 a = new C0703o0((C0712q0) u2, (C0703o0.C0705b) new C4814m(application)).mo4262a(C4815n.class);
        C8594l.m46770d(a, "ViewModelProvider(\n     …oreViewModel::class.java)");
        this.f8968d0 = (C4815n) a;
        FragmentActivity u22 = mo3705u2();
        Application application2 = mo3705u2().getApplication();
        C8594l.m46770d(application2, "requireActivity().application");
        C0696m0 a2 = new C0703o0((C0712q0) u22, (C0703o0.C0705b) new C4680h(application2)).mo4262a(C4681i.class);
        C8594l.m46770d(a2, "ViewModelProvider(\n     …aryViewModel::class.java)");
        C4681i iVar = (C4681i) a2;
        this.f8969e0 = iVar;
        if (iVar != null) {
            iVar.mo15417m().mo4149h(this, new C2554b(this));
        } else {
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public static final void m11792f3(C2557e eVar, Integer num) {
        C8594l.m46771e(eVar, "this$0");
        if (num != null && num.intValue() == 1) {
            Context v2 = eVar.mo3708v2();
            C8594l.m46770d(v2, "requireContext()");
            if (C4667p.m20178b(v2)) {
                eVar.m11790c3();
            } else {
                eVar.mo3634T2(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(C8594l.m46777k("package: ", eVar.mo3705u2().getPackageName()))), 1112);
            }
        } else {
            C4681i iVar = eVar.f8969e0;
            if (iVar != null) {
                iVar.mo15406D(false);
                C4681i iVar2 = eVar.f8969e0;
                if (iVar2 != null) {
                    iVar2.mo15410H(true);
                    eVar.mo10049b3(false);
                    return;
                }
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
    }

    /* renamed from: Y2 */
    public void mo10047Y2() {
        Bundle V = mo3638V();
        if (V != null) {
            this.f8970f0 = V.getBoolean(mo10048Z2(), false);
        }
        FragmentActivity u2 = mo3705u2();
        C4668q.C4669a aVar = C4668q.f13454a;
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        u2.setTheme(aVar.mo15401d(v2, this.f8970f0));
    }

    /* renamed from: Z2 */
    public final String mo10048Z2() {
        return this.f8971g0;
    }

    /* renamed from: b3 */
    public void mo10049b3(boolean z) {
    }

    /* renamed from: d3 */
    public void mo10050d3() {
        FragmentActivity u2 = mo3705u2();
        C8594l.m46770d(u2, "requireActivity()");
        if (C4667p.m20179c(u2)) {
            C0466a.m2986m(mo3705u2(), C4667p.m20177a(), 1111);
            return;
        }
        C4736s sVar = C4736s.f13541a;
        C0602j q0 = mo3693q0();
        C8594l.m46770d(q0, "parentFragmentManager");
        sVar.mo15465h(q0, new C2558a(this));
    }

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        mo10047Y2();
        super.mo3679l1(bundle);
        m11791e3();
    }
}
