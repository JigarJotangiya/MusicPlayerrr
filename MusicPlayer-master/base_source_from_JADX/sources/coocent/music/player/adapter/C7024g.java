package coocent.music.player.adapter;

import androidx.fragment.app.C0602j;
import androidx.fragment.app.C0618n;
import androidx.fragment.app.Fragment;
import p342g.p343a.p344a.p349f.p350b.C8028c;

/* renamed from: coocent.music.player.adapter.g */
/* compiled from: EqualizerAdapter */
public class C7024g extends C0618n {

    /* renamed from: i */
    private String[] f31124i;

    public C7024g(C0602j jVar) {
        super(jVar);
    }

    /* renamed from: e */
    public int mo6295e() {
        return this.f31124i.length;
    }

    /* renamed from: g */
    public CharSequence mo6297g(int i) {
        return this.f31124i[i];
    }

    /* renamed from: v */
    public Fragment mo4047v(int i) {
        return C8028c.m43966a(i);
    }

    /* renamed from: w */
    public void mo26929w(String[] strArr) {
        this.f31124i = strArr;
    }
}
