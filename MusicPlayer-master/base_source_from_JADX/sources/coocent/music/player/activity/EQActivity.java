package coocent.music.player.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import coocent.music.player.adapter.C7024g;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8345u;

public class EQActivity extends AppCompatActivity {

    /* renamed from: A */
    private C7024g f30577A;

    /* renamed from: B */
    private String[] f30578B;

    /* renamed from: C */
    private TabLayout f30579C;

    /* renamed from: D */
    private ImageView f30580D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C8337n f30581E;

    /* renamed from: F */
    ViewPager.C1180i f30582F = new C6864a();

    /* renamed from: z */
    private ViewPager f30583z;

    /* renamed from: coocent.music.player.activity.EQActivity$a */
    class C6864a implements ViewPager.C1180i {
        C6864a() {
        }

        /* renamed from: d */
        public void mo6207d(int i, float f, int i2) {
        }

        /* renamed from: r */
        public void mo6209r(int i) {
        }

        /* renamed from: s */
        public void mo6210s(int i) {
            EQActivity.this.f30581E.mo30160V1(i);
        }
    }

    /* renamed from: coocent.music.player.activity.EQActivity$b */
    class C6865b implements View.OnClickListener {
        C6865b() {
        }

        public void onClick(View view) {
            if (view.getId() == R.id.back) {
                EQActivity.this.m39028g2();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public void m39028g2() {
        finish();
    }

    /* renamed from: h2 */
    private void m39029h2() {
        this.f30578B = C8345u.m46325f(R.array.eq_tab_names);
        this.f30579C.setupWithViewPager(this.f30583z);
        C7024g gVar = new C7024g(mo3730H1());
        this.f30577A = gVar;
        gVar.mo26929w(this.f30578B);
        this.f30583z.setAdapter(this.f30577A);
        this.f30583z.setOffscreenPageLimit(3);
        this.f30583z.setCurrentItem(this.f30581E.mo30162W());
        this.f30583z.setOnPageChangeListener(this.f30582F);
    }

    /* renamed from: i2 */
    private void m39030i2() {
        setContentView((int) R.layout.activity_eq);
        this.f30580D = (ImageView) findViewById(R.id.back);
        this.f30583z = (ViewPager) findViewById(R.id.viewpager);
        this.f30579C = (TabLayout) findViewById(R.id.tabs);
        this.f30581E = new C8337n(this);
    }

    /* renamed from: j2 */
    private void m39031j2() {
        this.f30580D.setOnClickListener(new C6865b());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.eq_backgroud_color));
        }
        m39030i2();
        m39029h2();
        m39031j2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f30577A = null;
        this.f30583z = null;
    }
}
