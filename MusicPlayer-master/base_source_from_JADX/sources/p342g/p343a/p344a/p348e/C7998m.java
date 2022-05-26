package p342g.p343a.p344a.p348e;

import android.app.Dialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.C0584b;
import coocent.music.player.mode.SoundEffect;
import java.util.concurrent.Executors;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p160a.p161a.C4264b;
import p159f.p160a.p161a.C4269f;
import p342g.p343a.p344a.p346c.C7960m;
import p342g.p343a.p344a.p347d.C7976f;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: g.a.a.e.m */
/* compiled from: RenameSoundEffectDialog */
public class C7998m extends C0584b {

    /* renamed from: q0 */
    private C8001c f33719q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public C7960m f33720r0;

    /* renamed from: g.a.a.e.m$a */
    /* compiled from: RenameSoundEffectDialog */
    class C7999a implements C4269f.C4283m {
        C7999a(C7998m mVar) {
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            fVar.dismiss();
        }
    }

    /* renamed from: g.a.a.e.m$b */
    /* compiled from: RenameSoundEffectDialog */
    class C8000b implements C4269f.C4277g {

        /* renamed from: a */
        final /* synthetic */ SoundEffect f33721a;

        C8000b(SoundEffect soundEffect) {
            this.f33721a = soundEffect;
        }

        /* renamed from: a */
        public void mo14656a(C4269f fVar, CharSequence charSequence) {
            C7998m.this.mo29539i3(this.f33721a.mo26991C(), charSequence.toString());
        }
    }

    /* renamed from: g.a.a.e.m$c */
    /* compiled from: RenameSoundEffectDialog */
    private final class C8001c extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a */
        private int f33723a;

        /* renamed from: b */
        private String f33724b;

        public C8001c(int i, String str) {
            this.f33723a = i;
            this.f33724b = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(Void... voidArr) {
            return Integer.valueOf(C7976f.m43669g(C7998m.this.mo3651a0()).mo29527k(this.f33723a, this.f33724b));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() > 0) {
                Toast.makeText(C7998m.this.mo3651a0(), R.string.rename_sound_effect_success, 0).show();
                C7998m.this.mo3831X2();
            } else if (num.intValue() == 0) {
                Toast.makeText(C7998m.this.mo3651a0(), R.string.rename_sound_effect_fail, 0).show();
            } else if (num.intValue() == -1) {
                Toast.makeText(C7998m.this.mo3651a0(), R.string.rename_sound_effect_exist, 0).show();
            } else if (num.intValue() == -2) {
                Toast.makeText(C7998m.this.mo3651a0(), R.string.save_sound_effect_empty, 0).show();
            }
            if (C7998m.this.f33720r0 != null) {
                C7998m.this.f33720r0.mo26780D0(num.intValue());
            }
        }
    }

    /* renamed from: k3 */
    public static C7998m m43723k3(SoundEffect soundEffect) {
        C7998m mVar = new C7998m();
        Bundle bundle = new Bundle();
        bundle.putParcelable("soundEffect", soundEffect);
        mVar.mo3581C2(bundle);
        return mVar;
    }

    /* renamed from: c3 */
    public Dialog mo3836c3(Bundle bundle) {
        String str;
        SoundEffect soundEffect = (SoundEffect) mo3638V().getParcelable("soundEffect");
        C4269f.C4274d dVar = new C4269f.C4274d(mo3606L());
        dVar.mo14623J(C8345u.m46333n(R.string.rename_sound_effect));
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
        dVar.mo14627a(false);
        dVar.mo14619F(17039370);
        dVar.mo14648w(17039360);
        String string = mo3698s0().getString(R.string.input_list_name);
        if (soundEffect == null) {
            str = BuildConfig.FLAVOR;
        } else {
            str = soundEffect.mo26992D();
        }
        dVar.mo14638m(string, str, false, new C8000b(soundEffect));
        dVar.mo14615B(new C7999a(this));
        return dVar.mo14629c();
    }

    /* renamed from: i3 */
    public void mo29539i3(int i, String str) {
        C8001c cVar = this.f33719q0;
        if (cVar != null && cVar.getStatus() == AsyncTask.Status.RUNNING) {
            this.f33719q0.cancel(true);
            this.f33719q0 = null;
        }
        C8001c cVar2 = new C8001c(i, str);
        this.f33719q0 = cVar2;
        cVar2.executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
    }

    /* renamed from: l3 */
    public void mo29540l3(C7960m mVar) {
        this.f33720r0 = mVar;
    }
}
