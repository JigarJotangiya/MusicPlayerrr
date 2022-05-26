package com.coocent.videolibrary.p058ui.search;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0703o0;
import androidx.lifecycle.C0712q0;
import com.coocent.videolibrary.p058ui.BaseActivity;
import com.coocent.videolibrary.p058ui.p059i.C2650q;
import com.coocent.videoplayer.bean.VideoConfigBean;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4625g;
import p159f.p166c.p224o.C4627i;
import p159f.p166c.p224o.p225k.C4644p;
import p159f.p166c.p224o.p226l.C4667p;
import p159f.p166c.p224o.p226l.C4668q;
import p159f.p166c.p224o.p227m.C4680h;
import p159f.p166c.p224o.p227m.C4681i;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.videolibrary.ui.search.SearchActivity */
/* compiled from: SearchActivity.kt */
public final class SearchActivity extends BaseActivity {

    /* renamed from: E */
    public static final C2683a f9167E = new C2683a((C8589g) null);

    /* renamed from: C */
    private C4644p f9168C;

    /* renamed from: D */
    private C4681i f9169D;

    /* renamed from: com.coocent.videolibrary.ui.search.SearchActivity$a */
    /* compiled from: SearchActivity.kt */
    public static final class C2683a {
        private C2683a() {
        }

        public /* synthetic */ C2683a(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo10185a(Context context, String str) {
            C8594l.m46771e(context, "context");
            Intent intent = new Intent(context, SearchActivity.class);
            intent.putExtra("search_key", str);
            context.startActivity(intent);
        }
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4644p d = C4644p.m20143d(getLayoutInflater());
        C8594l.m46770d(d, "inflate(layoutInflater)");
        this.f9168C = d;
        if (d != null) {
            setContentView((View) d.mo7577a());
            Application application = getApplication();
            C8594l.m46770d(application, "application");
            C0696m0 a = new C0703o0((C0712q0) this, (C0703o0.C0705b) new C4680h(application)).mo4262a(C4681i.class);
            C8594l.m46770d(a, "ViewModelProvider(\n     …aryViewModel::class.java)");
            this.f9169D = (C4681i) a;
            C4644p pVar = this.f9168C;
            if (pVar != null) {
                pVar.f13432b.f13438f.setPopupTheme(C4668q.f13454a.mo15399b(this));
                C4644p pVar2 = this.f9168C;
                if (pVar2 != null) {
                    mo478Y1(pVar2.f13432b.f13438f);
                    C4644p pVar3 = this.f9168C;
                    if (pVar3 != null) {
                        pVar3.f13432b.f13437e.setEnabled(false);
                        ActionBar R1 = mo471R1();
                        if (R1 != null) {
                            R1.mo426y(getString(C4627i.coocent_search));
                        }
                        ActionBar R12 = mo471R1();
                        if (R12 != null) {
                            R12.mo423v(true);
                        }
                        ActionBar R13 = mo471R1();
                        if (R13 != null) {
                            R13.mo421t(true);
                        }
                        if (C4667p.m20178b(this)) {
                            C4681i iVar = this.f9169D;
                            if (iVar != null) {
                                iVar.mo15409G(true);
                            } else {
                                C8594l.m46783q("mVideoLibraryViewModel");
                                throw null;
                            }
                        }
                        String stringExtra = getIntent().getStringExtra("search_key");
                        C0620p i = mo3730H1().mo3957i();
                        C8594l.m46770d(i, "supportFragmentManager.beginTransaction()");
                        Fragment Y = mo3730H1().mo3938Y(stringExtra);
                        if (Y == null) {
                            C2650q.C2651a aVar = C2650q.f9118E0;
                            C8594l.m46769c(stringExtra);
                            Y = C2650q.C2651a.m12152c(aVar, stringExtra, 2, false, (VideoConfigBean) null, 12, (Object) null);
                        }
                        i.mo4076s(C4623e.layout_container, Y, stringExtra);
                        i.mo3826v(Y);
                        i.mo3815i();
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
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C4644p pVar = this.f9168C;
        if (pVar != null) {
            pVar.f13432b.f13434b.mo10357t(this);
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }
}
