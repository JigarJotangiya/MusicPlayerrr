package coocent.music.player.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.C6210c;
import com.google.android.material.tabs.TabLayout;
import coocent.music.player.adapter.C7023f;
import coocent.music.player.widget.DeepDefaultTitle;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

class FavoriteActivity extends AppCompatActivity {

    /* renamed from: A */
    private TabLayout f30590A;

    /* renamed from: B */
    private ViewPager2 f30591B;

    /* renamed from: C */
    private C7023f f30592C;

    /* renamed from: z */
    public DeepDefaultTitle f30593z;

    FavoriteActivity() {
    }

    /* renamed from: d2 */
    private void m39056d2() {
        C7023f fVar = new C7023f(this, 1);
        this.f30592C = fVar;
        this.f30591B.setAdapter(fVar);
        new C6210c(this.f30590A, this.f30591B, C6990o.f31053a).mo24836a();
    }

    /* renamed from: e2 */
    private void m39057e2() {
        setContentView((int) R.layout.fragment_favorite);
        this.f30593z = (DeepDefaultTitle) findViewById(R.id.defualt_title);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        this.f30590A = tabLayout;
        tabLayout.mo24728K(C8343s.m46295c(R.color.artist_detail_tab_text_color), C8343s.m46300h());
        this.f30591B = (ViewPager2) findViewById(R.id.viewPager2);
    }

    /* renamed from: h2 */
    private void m39059h2() {
        this.f30593z.setHomeIcon(false);
        this.f30593z.setMutilIcon(false);
        this.f30593z.setSort(0);
        this.f30593z.setTitleText(C8345u.m46333n(R.string.favorite));
        this.f30593z.setMenuIcon(false);
        this.f30593z.setTitleBackgroundColor(C8345u.m46326g(R.color.library_title_backgroud_color));
        this.f30593z.mo27431B(true, true);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m39057e2();
        m39056d2();
        m39059h2();
    }
}
