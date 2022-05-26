package p342g.p343a.p344a.p348e;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.C0584b;
import coocent.music.player.mode.SoundEffect;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p160a.p161a.C4264b;
import p159f.p160a.p161a.C4269f;
import p342g.p343a.p344a.p347d.C7976f;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

/* renamed from: g.a.a.e.l */
/* compiled from: EditSoundEffectDialog */
public class C7993l extends C0584b {

    /* renamed from: g.a.a.e.l$a */
    /* compiled from: EditSoundEffectDialog */
    class C7994a implements C4269f.C4283m {
        C7994a(C7993l lVar) {
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            fVar.dismiss();
        }
    }

    /* renamed from: g.a.a.e.l$b */
    /* compiled from: EditSoundEffectDialog */
    class C7995b implements C4269f.C4283m {

        /* renamed from: g.a.a.e.l$b$a */
        /* compiled from: EditSoundEffectDialog */
        class C7996a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ Activity f33715g;

            /* renamed from: g.a.a.e.l$b$a$a */
            /* compiled from: EditSoundEffectDialog */
            class C7997a implements Runnable {

                /* renamed from: g */
                final /* synthetic */ boolean f33717g;

                C7997a(boolean z) {
                    this.f33717g = z;
                }

                public void run() {
                    Toast.makeText(C7996a.this.f33715g, this.f33717g ? R.string.save_sound_effect_success : R.string.save_sound_effect_fail, 0).show();
                }
            }

            C7996a(Activity activity) {
                this.f33715g = activity;
            }

            public void run() {
                int i = C7993l.this.mo3638V().getInt("pageType");
                int i2 = C7993l.this.mo3638V().getInt("editSoundEffectId");
                boolean z = C7993l.this.mo3638V().getBoolean("sideBar");
                boolean e = C7976f.m43669g(C7993l.this.mo3651a0()).mo29522e(i2, (SoundEffect) C7993l.this.mo3638V().getParcelable("soundEffect"));
                Activity activity = this.f33715g;
                if (activity != null) {
                    activity.runOnUiThread(new C7997a(e));
                }
                if (e && this.f33715g != null) {
                    Intent intent = new Intent();
                    intent.putExtra("save_sound_effect", true);
                    intent.putExtra("pageType", i);
                    intent.putExtra("addId", i2);
                    intent.putExtra("sideBar", z);
                    this.f33715g.setResult(1002, intent);
                    this.f33715g.finish();
                }
            }
        }

        C7995b() {
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            new Thread(new C7996a(C7993l.this.mo3606L())).start();
            fVar.dismiss();
        }
    }

    /* renamed from: i3 */
    public static C7993l m43718i3(SoundEffect soundEffect, int i, int i2, boolean z) {
        C7993l lVar = new C7993l();
        Bundle bundle = new Bundle();
        bundle.putParcelable("soundEffect", soundEffect);
        bundle.putInt("pageType", i);
        bundle.putInt("editSoundEffectId", i2);
        bundle.putBoolean("sideBar", z);
        lVar.mo3581C2(bundle);
        return lVar;
    }

    /* renamed from: c3 */
    public Dialog mo3836c3(Bundle bundle) {
        C4269f.C4274d dVar = new C4269f.C4274d(mo3606L());
        dVar.mo14623J(C8345u.m46333n(R.string.edit_sound_effect_title));
        dVar.mo14631f(C8345u.m46333n(R.string.edit_sound_effect));
        dVar.mo14624K(C8345u.m46326g(R.color.black));
        dVar.mo14628b(C8345u.m46326g(R.color.white));
        dVar.mo14647v(C9332d.m49406c(mo3651a0(), R.color.colorAccent));
        dVar.mo14618E(C9332d.m49406c(mo3651a0(), R.color.colorAccent));
        dVar.mo14635j(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14644s(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14643r(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14626M(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14650y(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14630d(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14632g(C8345u.m46326g(R.color.color_bbb));
        dVar.mo14620G(C8345u.m46333n(R.string.eq_save));
        dVar.mo14649x(C8345u.m46333n(R.string.cancel));
        dVar.mo14616C(new C7995b());
        dVar.mo14627a(false);
        dVar.mo14615B(new C7994a(this));
        return dVar.mo14629c();
    }
}
