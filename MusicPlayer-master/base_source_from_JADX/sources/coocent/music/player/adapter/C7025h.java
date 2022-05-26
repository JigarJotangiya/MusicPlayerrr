package coocent.music.player.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.C0602j;
import androidx.fragment.app.C0618n;
import androidx.fragment.app.Fragment;
import p342g.p343a.p344a.p349f.p351c.C8239z2;

/* renamed from: coocent.music.player.adapter.h */
/* compiled from: LibraryAdapter */
public class C7025h extends C0618n {

    /* renamed from: i */
    private Fragment f31125i;

    public C7025h(C0602j jVar) {
        super(jVar);
    }

    /* renamed from: e */
    public int mo6295e() {
        return 5;
    }

    /* renamed from: q */
    public void mo4045q(ViewGroup viewGroup, int i, Object obj) {
        if (mo26930w() != obj) {
            this.f31125i = (Fragment) obj;
        }
        super.mo4045q(viewGroup, i, obj);
    }

    /* renamed from: v */
    public Fragment mo4047v(int i) {
        return C8239z2.m45496a(i);
    }

    /* renamed from: w */
    public Fragment mo26930w() {
        return this.f31125i;
    }
}
