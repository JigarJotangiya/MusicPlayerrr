package p342g.p343a.p344a.p348e;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.C0584b;
import androidx.fragment.app.FragmentActivity;
import coocent.music.player.activity.SkinDownLoadActivity;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.C9502v;
import p159f.p160a.p161a.C4264b;
import p159f.p160a.p161a.C4269f;
import p342g.p343a.p344a.p358i.C8344t;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

/* renamed from: g.a.a.e.i */
/* compiled from: ApkForcedUpdateDialog */
public class C7987i extends C0584b {

    /* renamed from: g.a.a.e.i$a */
    /* compiled from: ApkForcedUpdateDialog */
    class C7988a implements C4269f.C4283m {
        C7988a() {
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            FragmentActivity L = C7987i.this.mo3606L();
            if (L == null) {
                return;
            }
            if (C9502v.m49950u(C7987i.this.mo3651a0())) {
                C7987i.m43700i3(L);
                if (L != null && (L instanceof SkinDownLoadActivity)) {
                    ((SkinDownLoadActivity) L).mo26772v2(true);
                    return;
                }
                return;
            }
            C8344t.m46317e(C7987i.this.mo3651a0(), C7987i.this.mo3582D0(R.string.no_google_play));
        }
    }

    /* renamed from: i3 */
    public static void m43700i3(Activity activity) {
        Uri parse = Uri.parse("market://details?id=" + activity.getPackageName());
        try {
            Intent action = activity.getPackageManager().getLaunchIntentForPackage("com.android.vending").setAction("android.intent.action.VIEW");
            action.setData(parse);
            activity.startActivity(action);
        } catch (Exception unused) {
            C8344t.m46317e(C8345u.m46327h(), "An error occurred!");
        }
    }

    /* renamed from: j3 */
    public static C7987i m43701j3(String str, String str2) {
        C7987i iVar = new C7987i();
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putString("content", str2);
        iVar.mo3581C2(bundle);
        return iVar;
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
        dVar.mo14649x(C8345u.m46333n(R.string.cancel));
        dVar.mo14616C(new C7988a());
        return dVar.mo14629c();
    }
}
