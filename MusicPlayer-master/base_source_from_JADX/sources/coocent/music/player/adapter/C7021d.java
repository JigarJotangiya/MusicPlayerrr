package coocent.music.player.adapter;

import androidx.fragment.app.C0602j;
import androidx.fragment.app.C0618n;
import androidx.fragment.app.Fragment;

/* renamed from: coocent.music.player.adapter.d */
/* compiled from: ArtistDetailAdapter */
public class C7021d extends C0618n {

    /* renamed from: i */
    private String[] f31117i;

    /* renamed from: j */
    private long f31118j = -1;

    public C7021d(C0602j jVar, long j) {
        super(jVar);
        this.f31118j = j;
    }

    /* renamed from: e */
    public int mo6295e() {
        return this.f31117i.length;
    }

    /* renamed from: g */
    public CharSequence mo6297g(int i) {
        return this.f31117i[i];
    }

    /* renamed from: v */
    public Fragment mo4047v(int i) {
        return C7022e.m40009a(i, this.f31118j);
    }

    /* renamed from: w */
    public void mo26928w(String[] strArr) {
        this.f31117i = strArr;
    }
}
