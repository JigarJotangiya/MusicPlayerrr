package p159f.p166c.p224o.p228n.p230c;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.C0584b;
import com.coocent.videoplayer.p061s.C2723c;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.o.n.c.r */
/* compiled from: CommonDialog.kt */
public final class C4732r extends C0584b {

    /* renamed from: s0 */
    public static final C4733a f13538s0 = new C4733a((C8589g) null);
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public C4734b f13539q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public C4735c f13540r0;

    /* renamed from: f.c.o.n.c.r$a */
    /* compiled from: CommonDialog.kt */
    public static final class C4733a {
        private C4733a() {
        }

        public /* synthetic */ C4733a(C8589g gVar) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C4732r m20245b(C4733a aVar, C4735c cVar, C4734b bVar, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                bVar = null;
            }
            return aVar.mo15455a(cVar, bVar, z);
        }

        /* renamed from: a */
        public final C4732r mo15455a(C4735c cVar, C4734b bVar, boolean z) {
            C4732r rVar = new C4732r();
            rVar.mo3837d3(z);
            rVar.f13539q0 = bVar;
            rVar.f13540r0 = cVar;
            return rVar;
        }
    }

    /* renamed from: f.c.o.n.c.r$b */
    /* compiled from: CommonDialog.kt */
    public interface C4734b {
        /* renamed from: a */
        void mo15456a();
    }

    /* renamed from: f.c.o.n.c.r$c */
    /* compiled from: CommonDialog.kt */
    public interface C4735c {
        /* renamed from: a */
        Dialog mo15457a(Context context);
    }

    /* renamed from: Q1 */
    public void mo3623Q1() {
        Window window;
        super.mo3623Q1();
        Dialog a3 = mo3834a3();
        if (a3 != null && (window = a3.getWindow()) != null) {
            window.setLayout(C2723c.m12315b(mo3651a0()) - 150, -2);
        }
    }

    /* renamed from: c3 */
    public Dialog mo3836c3(Bundle bundle) {
        mo3615N2(true);
        C4735c cVar = this.f13540r0;
        if (cVar == null) {
            Dialog c3 = super.mo3836c3(bundle);
            C8594l.m46770d(c3, "{\n            super.onCr…dInstanceState)\n        }");
            return c3;
        }
        C8594l.m46769c(cVar);
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        return cVar.mo15457a(v2);
    }

    public void onCancel(DialogInterface dialogInterface) {
        C8594l.m46771e(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        C4734b bVar = this.f13539q0;
        if (bVar != null) {
            bVar.mo15456a();
        }
    }
}
