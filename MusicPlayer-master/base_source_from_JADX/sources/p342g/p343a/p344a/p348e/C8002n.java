package p342g.p343a.p344a.p348e;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.C0584b;
import androidx.fragment.app.FragmentActivity;
import coocent.music.player.mode.SoundEffect;
import java.util.Random;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p160a.p161a.C4264b;
import p159f.p160a.p161a.C4269f;
import p342g.p343a.p344a.p347d.C7976f;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: g.a.a.e.n */
/* compiled from: SaveSoundEffectDialog */
public class C8002n extends C0584b {

    /* renamed from: g.a.a.e.n$a */
    /* compiled from: SaveSoundEffectDialog */
    class C8003a implements C4269f.C4283m {
        C8003a(C8002n nVar) {
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            fVar.dismiss();
        }
    }

    /* renamed from: g.a.a.e.n$b */
    /* compiled from: SaveSoundEffectDialog */
    class C8004b implements C4269f.C4277g {

        /* renamed from: a */
        final /* synthetic */ boolean[] f33726a;

        /* renamed from: g.a.a.e.n$b$a */
        /* compiled from: SaveSoundEffectDialog */
        class C8005a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ CharSequence f33728g;

            /* renamed from: h */
            final /* synthetic */ Activity f33729h;

            /* renamed from: i */
            final /* synthetic */ C4269f f33730i;

            C8005a(CharSequence charSequence, Activity activity, C4269f fVar) {
                this.f33728g = charSequence;
                this.f33729h = activity;
                this.f33730i = fVar;
            }

            /* renamed from: a */
            static /* synthetic */ void m43735a(boolean[] zArr, Activity activity, boolean z) {
                zArr[0] = false;
                Toast.makeText(activity, z ? R.string.save_sound_effect_success : R.string.save_sound_effect_fail, 0).show();
            }

            /* renamed from: b */
            static /* synthetic */ void m43736b(boolean[] zArr, Activity activity) {
                zArr[0] = false;
                Toast.makeText(activity, R.string.save_sound_effect_exist, 0).show();
            }

            /* renamed from: c */
            static /* synthetic */ void m43737c(boolean[] zArr, Activity activity) {
                zArr[0] = false;
                Toast.makeText(activity, R.string.save_sound_effect_empty, 0).show();
            }

            public void run() {
                C8004b.this.f33726a[0] = true;
                String trim = this.f33728g.toString().trim();
                if (trim == null || trim.trim().isEmpty()) {
                    Activity activity = this.f33729h;
                    if (activity != null) {
                        activity.runOnUiThread(new C7982e(C8004b.this.f33726a, activity));
                    }
                } else if (!C7976f.m43669g(this.f33729h).mo29526j(trim)) {
                    SoundEffect soundEffect = (SoundEffect) C8002n.this.mo3638V().getParcelable("soundEffect");
                    boolean z = C8002n.this.mo3638V().getBoolean("sideBar");
                    int i = C8002n.this.mo3638V().getInt("pageType");
                    soundEffect.mo27049t0(Math.abs(trim.hashCode() + new Random().nextInt(10000)));
                    soundEffect.mo27051u0(this.f33728g.toString());
                    soundEffect.mo27024g0(1);
                    this.f33730i.dismiss();
                    boolean a = C7976f.m43669g(this.f33729h).mo29518a(soundEffect);
                    if (a && this.f33729h != null) {
                        Intent intent = new Intent();
                        intent.putExtra("save_sound_effect", true);
                        intent.putExtra("pageType", i);
                        intent.putExtra("addId", soundEffect.mo26991C());
                        intent.putExtra("sideBar", z);
                        this.f33729h.setResult(1002, intent);
                        this.f33729h.finish();
                    }
                    Activity activity2 = this.f33729h;
                    if (activity2 != null) {
                        activity2.runOnUiThread(new C7983f(C8004b.this.f33726a, activity2, a));
                    }
                } else {
                    Activity activity3 = this.f33729h;
                    if (activity3 != null) {
                        activity3.runOnUiThread(new C7984g(C8004b.this.f33726a, activity3));
                    }
                }
            }
        }

        C8004b(boolean[] zArr) {
            this.f33726a = zArr;
        }

        /* renamed from: a */
        public void mo14656a(C4269f fVar, CharSequence charSequence) {
            FragmentActivity L = C8002n.this.mo3606L();
            if (!this.f33726a[0]) {
                new Thread(new C8005a(charSequence, L, fVar)).start();
            }
        }
    }

    /* renamed from: g.a.a.e.n$c */
    /* compiled from: SaveSoundEffectDialog */
    class C8006c implements C4269f.C4283m {
        C8006c(C8002n nVar) {
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            fVar.dismiss();
        }
    }

    /* renamed from: i3 */
    public static C8002n m43731i3(SoundEffect soundEffect, int i, boolean z) {
        C8002n nVar = new C8002n();
        Bundle bundle = new Bundle();
        bundle.putParcelable("soundEffect", soundEffect);
        bundle.putInt("pageType", i);
        bundle.putBoolean("sideBar", z);
        nVar.mo3581C2(bundle);
        return nVar;
    }

    /* renamed from: c3 */
    public Dialog mo3836c3(Bundle bundle) {
        C4269f.C4274d dVar = new C4269f.C4274d(mo3606L());
        dVar.mo14623J(C8345u.m46333n(R.string.save_sound_effect));
        dVar.mo14624K(C8345u.m46326g(R.color.black));
        dVar.mo14628b(C8345u.m46326g(R.color.white));
        dVar.mo14632g(C8345u.m46326g(R.color.color_bbb));
        dVar.mo14647v(C9332d.m49406c(mo3651a0(), R.color.colorAccent));
        dVar.mo14618E(C9332d.m49406c(mo3651a0(), R.color.colorAccent));
        dVar.mo14635j(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14644s(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14643r(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14615B(new C8006c(this));
        dVar.mo14626M(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14650y(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14630d(C9332d.m49405b(mo3651a0(), R.color.colorAccent));
        dVar.mo14620G(C8345u.m46333n(R.string.eq_save));
        dVar.mo14649x(C8345u.m46333n(R.string.cancel));
        dVar.mo14638m("Enter sound effect name", BuildConfig.FLAVOR, false, new C8004b(new boolean[]{false}));
        dVar.mo14627a(false);
        dVar.mo14615B(new C8003a(this));
        return dVar.mo14629c();
    }
}
