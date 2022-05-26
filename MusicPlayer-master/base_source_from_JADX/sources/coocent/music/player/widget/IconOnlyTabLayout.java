package coocent.music.player.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8343s;

public class IconOnlyTabLayout extends TabLayout {

    /* renamed from: b0 */
    int[] f31594b0 = {R.drawable.ic_play_page02, R.drawable.ic_play_page03, R.drawable.ic_play_page04, R.drawable.ic_play_page05};

    /* renamed from: c0 */
    int[] f31595c0 = {R.drawable.ic_play_page02_1, R.drawable.ic_play_page06, R.drawable.ic_play_page07, R.drawable.ic_play_page08};

    /* renamed from: coocent.music.player.widget.IconOnlyTabLayout$a */
    class C7141a implements TabLayout.C6198d {

        /* renamed from: a */
        final /* synthetic */ ViewPager f31596a;

        C7141a(ViewPager viewPager) {
            this.f31596a = viewPager;
        }

        /* renamed from: a */
        public void mo24788a(TabLayout.C6203g gVar) {
        }

        /* renamed from: b */
        public void mo24789b(TabLayout.C6203g gVar) {
            IconOnlyTabLayout.this.setSelectTab(gVar.mo24806g());
            this.f31596a.setCurrentItem(gVar.mo24806g());
            gVar.mo24805f().setColorFilter(C8343s.m46300h(), PorterDuff.Mode.SRC_IN);
        }

        /* renamed from: c */
        public void mo24790c(TabLayout.C6203g gVar) {
            gVar.mo24805f().setColorFilter(C8343s.m46295c(R.color.app_sub_title_color), PorterDuff.Mode.SRC_IN);
        }
    }

    public IconOnlyTabLayout(Context context) {
        super(context);
        m40686R();
    }

    /* renamed from: R */
    private void m40686R() {
    }

    /* renamed from: Q */
    public void mo27508Q(ViewPager viewPager) {
        mo24736d(new C7141a(viewPager));
    }

    /* renamed from: S */
    public void mo27509S(Context context, ViewPager viewPager) {
        setupWithViewPager(viewPager);
        setSelectedTabIndicatorHeight(0);
        int tabCount = getTabCount();
        for (int i = 0; i < tabCount; i++) {
            mo24783x(i).mo24815p(this.f31594b0[i]);
        }
    }

    public void setSelectTab(int i) {
        int tabCount = getTabCount();
        for (int i2 = 0; i2 < tabCount; i2++) {
            if (i == i2) {
                mo24783x(i2).mo24816q(C8343s.m46303k(this.f31595c0[i2], R.color.colorAccent));
            } else {
                mo24783x(i2).mo24815p(this.f31594b0[i2]);
            }
        }
    }

    public IconOnlyTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40686R();
    }

    public IconOnlyTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m40686R();
    }
}
