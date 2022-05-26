package com.coocent.videolibrary.p058ui;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.C0602j;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0703o0;
import androidx.lifecycle.C0712q0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.coocent.videoplayer.bean.VideoConfigBean;
import com.un4seen.bass.BASS;
import p159f.p166c.p222m.C4613a;
import p159f.p166c.p222m.C4615b;
import p159f.p166c.p222m.C4616c;
import p159f.p166c.p224o.C4619a;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4625g;
import p159f.p166c.p224o.C4627i;
import p159f.p166c.p224o.p225k.C4629a;
import p159f.p166c.p224o.p226l.C4647b;
import p159f.p166c.p224o.p226l.C4648c;
import p159f.p166c.p224o.p226l.C4660j;
import p159f.p166c.p224o.p226l.C4668q;
import p159f.p166c.p224o.p227m.C4680h;
import p159f.p166c.p224o.p227m.C4681i;
import p159f.p166c.p231p.p234c.C4814m;
import p159f.p166c.p231p.p234c.C4815n;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.videolibrary.ui.ContentActivity */
/* compiled from: ContentActivity.kt */
public final class ContentActivity extends BaseActivity implements SwipeRefreshLayout.C1051j, C2627h {

    /* renamed from: H */
    public static final C2552a f8957H = new C2552a((C8589g) null);

    /* renamed from: I */
    private static VideoConfigBean f8958I;

    /* renamed from: C */
    private C4629a f8959C;

    /* renamed from: D */
    private C4815n f8960D;

    /* renamed from: E */
    private C4681i f8961E;

    /* renamed from: F */
    private C4613a f8962F;

    /* renamed from: G */
    private int f8963G;

    /* renamed from: com.coocent.videolibrary.ui.ContentActivity$a */
    /* compiled from: ContentActivity.kt */
    public static final class C2552a {
        private C2552a() {
        }

        public /* synthetic */ C2552a(C8589g gVar) {
            this();
        }
    }

    public ContentActivity() {
        C4616c a = C4615b.m20080a();
        this.f8962F = a == null ? null : a.mo15370a();
        this.f8963G = -1;
    }

    /* renamed from: p2 */
    private final void m11780p2() {
        Application application = getApplication();
        C8594l.m46770d(application, "application");
        C0696m0 a = new C0703o0((C0712q0) this, (C0703o0.C0705b) new C4814m(application)).mo4262a(C4815n.class);
        C8594l.m46770d(a, "ViewModelProvider(this, …oreViewModel::class.java)");
        this.f8960D = (C4815n) a;
        Application application2 = getApplication();
        C8594l.m46770d(application2, "application");
        C0696m0 a2 = new C0703o0((C0712q0) this, (C0703o0.C0705b) new C4680h(application2)).mo4262a(C4681i.class);
        C8594l.m46770d(a2, "ViewModelProvider(this, …aryViewModel::class.java)");
        this.f8961E = (C4681i) a2;
        C4815n nVar = this.f8960D;
        if (nVar != null) {
            nVar.mo15560x().mo4149h(this, new C2555c(this));
            C4681i iVar = this.f8961E;
            if (iVar != null) {
                iVar.mo15416l().mo4149h(this, new C2556d(this));
            } else {
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
        } else {
            C8594l.m46783q("mVideoStoreViewModel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m11781q2(ContentActivity contentActivity, Exception exc) {
        C8594l.m46771e(contentActivity, "this$0");
        C4629a aVar = contentActivity.f8959C;
        if (aVar != null) {
            aVar.f13354e.setRefreshing(false);
            C4613a aVar2 = contentActivity.f8962F;
            if (aVar2 != null) {
                C4629a aVar3 = contentActivity.f8959C;
                if (aVar3 != null) {
                    FrameLayout frameLayout = aVar3.f13352c;
                    C8594l.m46770d(frameLayout, "mBinding.layoutAds");
                    aVar2.mo15359e(frameLayout);
                    return;
                }
                C8594l.m46783q("mBinding");
                throw null;
            }
            return;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m11782r2(ContentActivity contentActivity, Integer num) {
        int i;
        C8594l.m46771e(contentActivity, "this$0");
        int i2 = contentActivity.f8963G;
        if (num == null || i2 != num.intValue()) {
            C8594l.m46770d(num, "function");
            contentActivity.f8963G = num.intValue();
            contentActivity.invalidateOptionsMenu();
            ActionBar R1 = contentActivity.mo471R1();
            if (R1 != null) {
                if (num.intValue() == 1) {
                    i = C4627i.coocent_mime_type_folder;
                } else {
                    i = C4627i.coocent_mime_type_video;
                }
                R1.mo426y(contentActivity.getString(i));
            }
            C0602j H1 = contentActivity.mo3730H1();
            C8594l.m46770d(H1, "supportFragmentManager");
            C4660j.m20161a(H1, C4623e.layout_container, num.intValue(), f8958I);
        }
    }

    /* renamed from: J */
    public void mo10042J(boolean z) {
        C4629a aVar = this.f8959C;
        if (aVar != null) {
            aVar.f13354e.setEnabled(z);
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* renamed from: e1 */
    public void mo5827e1() {
        mo10032i2();
    }

    /* renamed from: h2 */
    public void mo10031h2(boolean z) {
        C4629a aVar = this.f8959C;
        if (aVar != null) {
            aVar.f13354e.setRefreshing(z);
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4629a d = C4629a.m20084d(getLayoutInflater());
        C8594l.m46770d(d, "inflate(layoutInflater)");
        this.f8959C = d;
        if (d != null) {
            setContentView((View) d.mo7577a());
            C4629a aVar = this.f8959C;
            if (aVar != null) {
                aVar.f13355f.setPopupTheme(C4668q.f13454a.mo15399b(this));
                C4629a aVar2 = this.f8959C;
                if (aVar2 != null) {
                    mo478Y1(aVar2.f13355f);
                    ActionBar R1 = mo471R1();
                    if (R1 != null) {
                        R1.mo423v(true);
                        R1.mo420s(true);
                    }
                    C4629a aVar3 = this.f8959C;
                    if (aVar3 != null) {
                        SwipeRefreshLayout swipeRefreshLayout = aVar3.f13354e;
                        swipeRefreshLayout.setColorSchemeColors(C4647b.m20153b(this, C4619a.colorAccent, 0, 4, (Object) null));
                        swipeRefreshLayout.setRefreshing(true);
                        swipeRefreshLayout.setOnRefreshListener(this);
                        C4613a aVar4 = this.f8962F;
                        if (aVar4 != null) {
                            C4629a aVar5 = this.f8959C;
                            if (aVar5 != null) {
                                FrameLayout frameLayout = aVar5.f13352c;
                                C8594l.m46770d(frameLayout, "mBinding.layoutAds");
                                aVar4.mo15361g(frameLayout);
                            } else {
                                C8594l.m46783q("mBinding");
                                throw null;
                            }
                        }
                        if (bundle != null) {
                            this.f8963G = bundle.getInt("current_function", -1);
                        }
                        Intent intent = getIntent();
                        if (intent != null) {
                            f8958I = (VideoConfigBean) intent.getParcelableExtra("video_config_bean");
                        }
                        m11780p2();
                        mo5827e1();
                        return;
                    }
                    C8594l.m46783q("mBinding");
                    throw null;
                }
                C8594l.m46783q("mBinding");
                throw null;
            }
            C8594l.m46783q("mBinding");
            throw null;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C4625g.video_menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C4613a aVar = this.f8962F;
        if (aVar != null) {
            C4629a aVar2 = this.f8959C;
            if (aVar2 != null) {
                FrameLayout frameLayout = aVar2.f13352c;
                C8594l.m46770d(frameLayout, "mBinding.layoutAds");
                aVar.mo15365k(frameLayout);
                return;
            }
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        WindowInsetsController windowInsetsController;
        super.onResume();
        mo5827e1();
        C4629a aVar = this.f8959C;
        if (aVar != null) {
            aVar.f13351b.mo10357t(this);
            Window window = getWindow();
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                if (C4648c.m20155b(this) && (windowInsetsController = window.getDecorView().getWindowInsetsController()) != null) {
                    windowInsetsController.setSystemBarsAppearance(8, 8);
                }
                window.setStatusBarColor(C4647b.m20153b(this, C4619a.colorPrimaryDark, 0, 4, (Object) null));
            } else if (i >= 21) {
                window.getDecorView().setSystemUiVisibility(5376);
                window.addFlags(Integer.MIN_VALUE);
                if (i >= 23) {
                    window.setStatusBarColor(C4647b.m20153b(this, C4619a.colorPrimaryDark, 0, 4, (Object) null));
                    if (C4648c.m20155b(this)) {
                        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
                    }
                } else {
                    window.setStatusBarColor(0);
                }
            } else if (i >= 19) {
                window.addFlags(BASS.BASS_SPEAKER_REAR2);
            }
            if (i >= 28) {
                getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
                if (i >= 29) {
                    getWindow().setStatusBarContrastEnforced(false);
                    getWindow().setNavigationBarContrastEnforced(false);
                    return;
                }
                return;
            }
            return;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        C8594l.m46771e(bundle, "outState");
        C8594l.m46771e(persistableBundle, "outPersistentState");
        super.onSaveInstanceState(bundle, persistableBundle);
        int i = this.f8963G;
        if (i != -1) {
            bundle.putInt("current_function", i);
        }
    }

    /* renamed from: s1 */
    public void mo10045s1(boolean z) {
        C4629a aVar = this.f8959C;
        if (aVar != null) {
            aVar.f13354e.setRefreshing(z);
            if (z) {
                mo5827e1();
                return;
            }
            return;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    /* renamed from: v0 */
    public void mo10046v0(String str) {
        C8594l.m46771e(str, "title");
        ActionBar R1 = mo471R1();
        if (R1 != null) {
            R1.mo426y(str);
        }
    }
}
