package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.coocent.music.base.data.entity.Music;
import com.ocnyang.pagetransformerhelp.cardtransformer.BannerViewPager;
import com.ocnyang.pagetransformerhelp.cardtransformer.C6767c;
import com.ocnyang.pagetransformerhelp.cardtransformer.C6769e;
import java.util.ArrayList;
import java.util.List;
import p342g.p343a.p344a.p346c.C7961n;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8345u;

public class AlbumArtViewPager extends BannerViewPager {
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C7961n f31443v;

    /* renamed from: w */
    int f31444w = 0;

    /* renamed from: x */
    boolean f31445x = false;

    /* renamed from: y */
    private C8337n f31446y;

    /* renamed from: coocent.music.player.widget.AlbumArtViewPager$a */
    class C7120a implements BannerViewPager.C6764d {

        /* renamed from: a */
        final /* synthetic */ BannerViewPager.C6764d f31447a;

        C7120a(AlbumArtViewPager albumArtViewPager, BannerViewPager.C6764d dVar) {
            this.f31447a = dVar;
        }

        /* renamed from: a */
        public void mo26342a(View view, int i) {
            this.f31447a.mo26342a(view, i);
        }
    }

    /* renamed from: coocent.music.player.widget.AlbumArtViewPager$b */
    class C7121b implements C6769e {
        C7121b(AlbumArtViewPager albumArtViewPager, int i) {
        }
    }

    /* renamed from: coocent.music.player.widget.AlbumArtViewPager$c */
    class C7122c implements ViewPager.C1180i {
        C7122c() {
        }

        /* renamed from: d */
        public void mo6207d(int i, float f, int i2) {
            AlbumArtViewPager.this.f31443v.mo26660d(i, f, i2);
        }

        /* renamed from: r */
        public void mo6209r(int i) {
            if (i == 1) {
                AlbumArtViewPager albumArtViewPager = AlbumArtViewPager.this;
                albumArtViewPager.f31445x = true;
                albumArtViewPager.f31444w = albumArtViewPager.f30250h.getCurrentItem();
                AlbumArtViewPager.this.f31443v.mo26678r(i);
            } else if (i == 2) {
                AlbumArtViewPager.this.f31443v.mo26678r(i);
            }
        }

        /* renamed from: s */
        public void mo6210s(int i) {
            AlbumArtViewPager.this.f31443v.mo26666f1();
            AlbumArtViewPager albumArtViewPager = AlbumArtViewPager.this;
            int i2 = albumArtViewPager.f31444w;
            if (i == i2) {
                albumArtViewPager.f31445x = false;
            } else if (i > i2) {
                if (albumArtViewPager.f31445x) {
                    albumArtViewPager.f31443v.mo26661d0();
                }
                AlbumArtViewPager albumArtViewPager2 = AlbumArtViewPager.this;
                albumArtViewPager2.f31444w = i;
                albumArtViewPager2.f31445x = false;
            } else if (i < i2) {
                if (albumArtViewPager.f31445x) {
                    albumArtViewPager.f31443v.mo26684w();
                }
                AlbumArtViewPager albumArtViewPager3 = AlbumArtViewPager.this;
                albumArtViewPager3.f31444w = i;
                albumArtViewPager3.f31445x = false;
            }
        }
    }

    public AlbumArtViewPager(Context context) {
        super(context);
        m40525o(context);
    }

    /* renamed from: o */
    private void m40525o(Context context) {
        this.f31446y = new C8337n(context);
    }

    /* renamed from: p */
    private List<C6767c> m40526p(List<Music> list) {
        List<Music> list2 = list;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            if (this.f31446y == null) {
                m40525o(C8345u.m46327h());
            }
            arrayList.add(new C6767c(C8314f.m45973b(C8345u.m46327h(), 0, list2.get(i).mo9215k(), list2.get(i).mo9205d()), list2.get(i).mo9218n(), list2.get(i).mo9210g(), list2.get(i).mo9215k(), list2.get(i).mo9205d()));
        }
        return arrayList;
    }

    /* renamed from: q */
    public void mo27362q(int i) {
        List<Music> arrayList = new ArrayList<>();
        if (i == 0) {
            arrayList = C8287e.m45814W() ? C8287e.m45869t() : C8287e.m45867s();
        } else if (i == 1) {
            arrayList = C8287e.m45867s();
        } else if (i == 2) {
            arrayList = C8287e.m45869t();
        }
        if (arrayList != null) {
            mo26326g(m40526p(arrayList));
        }
    }

    /* renamed from: r */
    public void mo27363r(int i, BannerViewPager.C6764d dVar) {
        List<Music> s = C8287e.m45790K() == 0 ? C8287e.m45867s() : C8287e.m45869t();
        if (s != null) {
            mo26332i(i, m40526p(s), new C7121b(this, i));
            mo26335l((ViewPager.C1181j) null);
            mo26331h(false);
            mo26334k(new C7120a(this, dVar));
            mo26333j(false);
        }
    }

    public void setCurrentItem(boolean z) {
        try {
            ViewPager viewPager = getViewPager();
            if (z) {
                viewPager.setCurrentItem(C8287e.m45863q());
                return;
            }
            List<C6767c> data = getData();
            for (int i = 0; i < data.size(); i++) {
                if (C8287e.m45873v().mo9215k() == data.get(i).mo26348a()) {
                    viewPager.setCurrentItem(i);
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setOnPagerChangeListener(C7961n nVar) {
        this.f31443v = nVar;
        getViewPager().setOnPageChangeListener(new C7122c());
    }

    public AlbumArtViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40525o(context);
    }

    public AlbumArtViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m40525o(context);
    }
}
