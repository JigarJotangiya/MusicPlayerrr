package com.ocnyang.pagetransformerhelp.cardtransformer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.ocnyang.pagetransformerhelp.cardtransformer.p270g.C6772b;
import com.ocnyang.pagetransformerhelp.cardtransformer.p270g.C6773c;
import com.ocnyang.pagetransformerhelp.cardtransformer.p270g.C6774d;
import com.ocnyang.pagetransformerhelp.cardtransformer.p270g.C6775e;
import com.ocnyang.pagetransformerhelp.cardtransformer.p270g.C6776f;
import com.ocnyang.pagetransformerhelp.cardtransformer.p270g.C6777g;
import com.ocnyang.pagetransformerhelp.cardtransformer.p270g.C6778h;
import com.ocnyang.pagetransformerhelp.cardtransformer.p270g.C6779i;
import com.ocnyang.pagetransformerhelp.cardtransformer.p270g.C6780j;
import com.ocnyang.pagetransformerhelp.cardtransformer.p270g.C6781k;
import com.ocnyang.pagetransformerhelp.cardtransformer.p270g.C6782l;
import com.ocnyang.pagetransformerhelp.cardtransformer.p270g.C6783m;
import com.ocnyang.pagetransformerhelp.cardtransformer.p270g.C6784n;
import com.ocnyang.pagetransformerhelp.cardtransformer.p270g.C6785o;
import com.ocnyang.pagetransformerhelp.cardtransformer.p270g.C6786p;
import coocent.music.player.widget.CashErrorViewPager;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class BannerViewPager extends FrameLayout {

    /* renamed from: g */
    protected int f30249g;

    /* renamed from: h */
    protected CashErrorViewPager f30250h;

    /* renamed from: i */
    public ViewPager.C1181j f30251i;

    /* renamed from: j */
    protected C6766b f30252j;

    /* renamed from: k */
    protected C6768d f30253k;

    /* renamed from: l */
    protected int f30254l;

    /* renamed from: m */
    protected LinearLayout f30255m;

    /* renamed from: n */
    protected TextView f30256n;

    /* renamed from: o */
    protected boolean f30257o;

    /* renamed from: p */
    protected C6764d f30258p;

    /* renamed from: q */
    protected BaseIndicator f30259q;

    /* renamed from: r */
    protected boolean f30260r;

    /* renamed from: s */
    protected int f30261s;

    /* renamed from: t */
    private int f30262t;
    @SuppressLint({"HandlerLeak"})

    /* renamed from: u */
    protected Handler f30263u;

    /* renamed from: com.ocnyang.pagetransformerhelp.cardtransformer.BannerViewPager$a */
    class C6761a extends Handler {
        C6761a() {
        }

        public void handleMessage(Message message) {
            BannerViewPager bannerViewPager = BannerViewPager.this;
            if (bannerViewPager.f30257o) {
                CashErrorViewPager cashErrorViewPager = bannerViewPager.f30250h;
                cashErrorViewPager.setCurrentItem(cashErrorViewPager.getCurrentItem() + 1);
                sendEmptyMessageDelayed(0, (long) BannerViewPager.this.f30249g);
            }
        }
    }

    /* renamed from: com.ocnyang.pagetransformerhelp.cardtransformer.BannerViewPager$b */
    class C6762b implements ViewPager.C1180i {
        C6762b() {
        }

        /* renamed from: d */
        public void mo6207d(int i, float f, int i2) {
        }

        /* renamed from: r */
        public void mo6209r(int i) {
        }

        /* renamed from: s */
        public void mo6210s(int i) {
            BannerViewPager.this.setTitleSlogan(i);
            if (BannerViewPager.this.f30254l > 0) {
                for (int i2 = 0; i2 < BannerViewPager.this.f30255m.getChildCount(); i2++) {
                    BannerViewPager bannerViewPager = BannerViewPager.this;
                    if (i2 == i % bannerViewPager.f30254l) {
                        ((BaseIndicator) bannerViewPager.f30255m.getChildAt(i2)).setState(true);
                    } else {
                        ((BaseIndicator) bannerViewPager.f30255m.getChildAt(i2)).setState(false);
                    }
                }
            }
        }
    }

    /* renamed from: com.ocnyang.pagetransformerhelp.cardtransformer.BannerViewPager$c */
    class C6763c implements View.OnClickListener {
        C6763c() {
        }

        public void onClick(View view) {
            BannerViewPager.this.mo26321a(view);
        }
    }

    /* renamed from: com.ocnyang.pagetransformerhelp.cardtransformer.BannerViewPager$d */
    public interface C6764d {
        /* renamed from: a */
        void mo26342a(View view, int i);
    }

    public BannerViewPager(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public static int m38600b(Context context, int i, boolean z) {
        DisplayMetrics displayMetrics = context.getApplicationContext().getResources().getDisplayMetrics();
        return z ? (int) ((((float) i) / 1080.0f) * ((float) displayMetrics.widthPixels)) : (int) ((((float) i) / 1920.0f) * ((float) displayMetrics.heightPixels));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26321a(View view) {
        C6764d dVar = this.f30258p;
        if (dVar != null && this.f30254l > 0) {
            dVar.mo26342a(view, this.f30250h.getCurrentItem() % this.f30254l);
        }
    }

    /* renamed from: c */
    public void mo26322c() {
        this.f30260r = true;
        this.f30257o = true;
        this.f30254l = 1;
        this.f30249g = 5000;
        mo26324e();
        mo26323d();
        this.f30263u.sendEmptyMessageDelayed(0, (long) this.f30249g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo26323d() {
        this.f30250h.mo6230c(new C6762b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo26324e() {
        View.inflate(getContext(), R.layout.layout_bannerviewpager, this);
        this.f30250h = (CashErrorViewPager) findViewById(R.id.viewPager);
        findViewById(R.id.fl_root).setOnClickListener(new C6763c());
        this.f30250h.setOffscreenPageLimit(0);
        this.f30255m = (LinearLayout) findViewById(R.id.bannerIndicators);
        this.f30256n = (TextView) findViewById(R.id.bannerTitle);
    }

    /* renamed from: f */
    public void mo26325f() {
        if (this.f30262t == 0) {
            C6768d dVar = this.f30253k;
            if (dVar != null) {
                dVar.mo6300l();
                return;
            }
            return;
        }
        C6766b bVar = this.f30252j;
        if (bVar != null) {
            bVar.mo6300l();
        }
    }

    /* renamed from: g */
    public void mo26326g(List<C6767c> list) {
        if (this.f30262t == 0) {
            C6768d dVar = this.f30253k;
            if (dVar != null) {
                dVar.mo26352y(list);
                return;
            }
            return;
        }
        C6766b bVar = this.f30252j;
        if (bVar != null) {
            bVar.mo26346w(list);
        }
    }

    public int getCurrentType() {
        ViewPager.C1181j jVar = this.f30251i;
        if (jVar instanceof C6784n) {
            this.f30261s = 0;
        } else if (jVar instanceof C6772b) {
            this.f30261s = 1;
        } else if (jVar instanceof C6773c) {
            this.f30261s = 2;
        } else if (jVar instanceof C6774d) {
            this.f30261s = 3;
        } else if (jVar instanceof C6776f) {
            this.f30261s = 4;
        } else if (jVar instanceof C6778h) {
            this.f30261s = 5;
        } else if (jVar instanceof C6777g) {
            this.f30261s = 6;
        } else if (jVar instanceof C6779i) {
            this.f30261s = 7;
        } else if (jVar instanceof C6780j) {
            this.f30261s = 8;
        } else if (jVar instanceof C6781k) {
            this.f30261s = 9;
        } else if (jVar instanceof C6782l) {
            this.f30261s = 10;
        } else if (jVar instanceof C6783m) {
            this.f30261s = 11;
        } else if (jVar instanceof C6785o) {
            this.f30261s = 12;
        } else if (jVar instanceof C6786p) {
            this.f30261s = 13;
        }
        return this.f30261s;
    }

    public List<C6767c> getData() {
        if (this.f30262t == 0) {
            return this.f30253k.mo26350v();
        }
        return this.f30252j.mo26345v();
    }

    /* access modifiers changed from: protected */
    public BaseIndicator getIndicatorView() {
        return this.f30259q;
    }

    public ViewPager getViewPager() {
        return this.f30250h;
    }

    /* renamed from: h */
    public BannerViewPager mo26331h(boolean z) {
        this.f30257o = z;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public BannerViewPager mo26332i(int i, List<C6767c> list, C6769e eVar) {
        this.f30262t = i;
        if (i == 0) {
            C6768d dVar = new C6768d(this);
            this.f30253k = dVar;
            if (dVar != null) {
                dVar.mo26353z(list);
            }
        } else {
            C6766b bVar = new C6766b(this);
            this.f30252j = bVar;
            if (bVar != null) {
                bVar.mo26347x(list);
            }
        }
        C6768d dVar2 = this.f30253k;
        if (dVar2 != null) {
            dVar2.mo26353z(list);
        }
        this.f30254l = list.size();
        if (i == 0) {
            this.f30250h.setAdapter(this.f30253k);
        } else {
            this.f30250h.setAdapter(this.f30252j);
        }
        this.f30250h.setCurrentItem(0);
        setTitleSlogan(0);
        return this;
    }

    /* renamed from: j */
    public BannerViewPager mo26333j(boolean z) {
        this.f30260r = z;
        setTitleSlogan(this.f30250h.getCurrentItem());
        return this;
    }

    /* renamed from: k */
    public BannerViewPager mo26334k(C6764d dVar) {
        this.f30258p = dVar;
        return this;
    }

    /* renamed from: l */
    public BannerViewPager mo26335l(ViewPager.C1181j jVar) {
        this.f30251i = jVar;
        this.f30250h.mo6222R(true, jVar);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception unused) {
        }
    }

    public void setCurrentType(int i) {
        if (i == 0) {
            mo26335l(new C6784n());
            this.f30261s = 0;
        } else if (i == 1) {
            mo26335l(new C6772b());
            this.f30261s = 1;
        } else if (i == 2) {
            mo26335l(new C6773c());
            this.f30261s = 2;
        } else if (i == 3) {
            mo26335l(new C6774d());
            this.f30261s = 3;
        } else if (i == 4) {
            mo26335l(new C6776f());
            this.f30261s = 4;
        } else if (i == 5) {
            mo26335l(new C6778h());
            this.f30261s = 5;
        } else if (i == 6) {
            mo26335l(new C6777g());
            this.f30261s = 6;
        } else if (i == 7) {
            mo26335l(new C6779i());
            this.f30261s = 7;
        } else if (i == 8) {
            mo26335l(new C6780j());
            this.f30261s = 8;
        } else if (i == 9) {
            mo26335l(new C6781k());
            this.f30261s = 9;
        } else if (i == 10) {
            mo26335l(new C6782l());
            this.f30261s = 10;
        } else if (i == 11) {
            mo26335l(new C6783m());
            this.f30261s = 11;
        } else if (i == 12) {
            mo26335l(new C6785o());
            this.f30261s = 12;
        } else if (i == 13) {
            mo26335l(new C6786p());
            this.f30261s = 13;
        } else {
            mo26335l(new C6775e());
            this.f30261s = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void setIndicators(int i) {
        this.f30255m.removeAllViews();
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f30259q == null) {
                C6770f fVar = new C6770f(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m38600b(getContext(), 20, false), m38600b(getContext(), 20, false));
                layoutParams.setMargins(m38600b(getContext(), 10, true), 0, m38600b(getContext(), 10, true), 0);
                fVar.setLayoutParams(layoutParams);
                this.f30255m.addView(fVar);
            } else {
                Log.e("iii", "count" + i2);
                BaseIndicator baseIndicator = this.f30259q;
                ViewParent parent = baseIndicator.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(baseIndicator);
                }
                this.f30255m.addView(baseIndicator);
                Log.e("iii", BuildConfig.FLAVOR + this.f30255m.getChildCount());
            }
        }
        Log.e("iii", BuildConfig.FLAVOR + this.f30255m.getChildCount());
        ((BaseIndicator) this.f30255m.getChildAt(0)).setState(true);
    }

    /* access modifiers changed from: protected */
    public void setTitleSlogan(int i) {
        String str;
        if (this.f30260r) {
            if (this.f30256n.getVisibility() == 8) {
                this.f30256n.setVisibility(0);
            }
            if (this.f30254l > 0) {
                if (this.f30262t == 0) {
                    str = this.f30253k.mo26350v().get(i % this.f30254l).mo26349b();
                } else {
                    str = this.f30252j.mo26345v().get(i % this.f30254l).mo26349b();
                }
                this.f30256n.setText(str);
            }
        } else if (this.f30256n.getVisibility() == 0) {
            this.f30256n.setVisibility(8);
        }
    }

    public BannerViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30261s = 0;
        this.f30262t = 0;
        this.f30263u = new C6761a();
        mo26322c();
    }
}
