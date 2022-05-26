package p342g.p343a.p344a.p348e;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.C0584b;
import androidx.fragment.app.FragmentActivity;
import coocent.music.player.activity.SkinDownLoadActivity;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p160a.p161a.C4264b;
import p159f.p160a.p161a.C4269f;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

/* renamed from: g.a.a.e.o */
/* compiled from: SkinUpdateDialog */
public class C8007o extends C0584b {

    /* renamed from: g.a.a.e.o$a */
    /* compiled from: SkinUpdateDialog */
    class C8008a implements C4269f.C4283m {
        C8008a() {
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            FragmentActivity L = C8007o.this.mo3606L();
            if (L != null && (L instanceof SkinDownLoadActivity)) {
                ((SkinDownLoadActivity) L).mo26769A2();
            }
        }
    }

    /* renamed from: g.a.a.e.o$b */
    /* compiled from: SkinUpdateDialog */
    class C8009b implements C4269f.C4283m {
        C8009b() {
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            FragmentActivity L = C8007o.this.mo3606L();
            if (L != null && (L instanceof SkinDownLoadActivity)) {
                ((SkinDownLoadActivity) L).mo26771k2();
            }
        }
    }

    /* renamed from: i3 */
    public static C8007o m43739i3(String str, String str2) {
        C8007o oVar = new C8007o();
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putString("content", str2);
        oVar.mo3581C2(bundle);
        return oVar;
    }

    /* renamed from: c3 */
    public Dialog mo3836c3(Bundle bundle) {
        String string = mo3638V().getString("title");
        String string2 = mo3638V().getString("content");
        C4269f.C4274d dVar = new C4269f.C4274d(mo3606L());
        dVar.mo14623J(string);
        dVar.mo14631f(string2);
        dVar.mo14624K(C8345u.m46326g(R.color.black));
        dVar.mo14628b(C8345u.m46326g(R.color.white));
        dVar.mo14632g(C8345u.m46326g(R.color.color_bbb));
        dVar.mo14647v(C9332d.m49406c(mo3651a0(), R.color.colorAccent));
        dVar.mo14618E(C9332d.m49406c(mo3651a0(), R.color.colorAccent));
        dVar.mo14635j(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14644s(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14643r(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14626M(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14650y(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14630d(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14620G(C8345u.m46333n(R.string.update));
        dVar.mo14649x(C8345u.m46333n(R.string.no_continue));
        dVar.mo14616C(new C8009b());
        dVar.mo14615B(new C8008a());
        return dVar.mo14629c();
    }
}
