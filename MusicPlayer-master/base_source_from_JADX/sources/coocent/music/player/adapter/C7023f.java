package coocent.music.player.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p349f.p351c.C8183r2;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: coocent.music.player.adapter.f */
/* compiled from: CommonViewPagerAdapter */
public class C7023f extends FragmentStateAdapter {

    /* renamed from: i */
    private final String[] f31121i = C8345u.m46325f(R.array.favorite_tab_names);

    /* renamed from: j */
    private long f31122j = -1;

    /* renamed from: k */
    int f31123k;

    public C7023f(FragmentActivity fragmentActivity, int i) {
        super(fragmentActivity);
        this.f31123k = i;
    }

    /* renamed from: e */
    public Fragment mo6310e(int i) {
        return C8183r2.m45162a(i, this.f31123k, this.f31122j);
    }

    public int getItemCount() {
        int i = this.f31123k;
        if (i == 2 || i == 1) {
            return this.f31121i.length;
        }
        return 1;
    }

    public C7023f(FragmentActivity fragmentActivity, int i, long j) {
        super(fragmentActivity);
        this.f31123k = i;
        this.f31122j = j;
    }
}
