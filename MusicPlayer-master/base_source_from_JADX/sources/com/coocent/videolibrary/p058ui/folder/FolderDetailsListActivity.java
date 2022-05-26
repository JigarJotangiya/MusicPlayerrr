package com.coocent.videolibrary.p058ui.folder;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0703o0;
import androidx.lifecycle.C0712q0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.coocent.videolibrary.p058ui.BaseActivity;
import com.coocent.videolibrary.p058ui.p059i.C2650q;
import com.coocent.videoplayer.bean.VideoConfigBean;
import p159f.p166c.p222m.C4613a;
import p159f.p166c.p222m.C4615b;
import p159f.p166c.p222m.C4616c;
import p159f.p166c.p224o.C4619a;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4625g;
import p159f.p166c.p224o.p225k.C4645q;
import p159f.p166c.p224o.p226l.C4647b;
import p159f.p166c.p224o.p226l.C4667p;
import p159f.p166c.p224o.p226l.C4668q;
import p159f.p166c.p224o.p227m.C4680h;
import p159f.p166c.p224o.p227m.C4681i;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.videolibrary.ui.folder.FolderDetailsListActivity */
/* compiled from: FolderDetailsListActivity.kt */
public final class FolderDetailsListActivity extends BaseActivity implements SwipeRefreshLayout.C1051j {

    /* renamed from: F */
    public static final C2593a f9033F = new C2593a((C8589g) null);

    /* renamed from: C */
    private C4613a f9034C;

    /* renamed from: D */
    private C4645q f9035D;

    /* renamed from: E */
    private C4681i f9036E;

    /* renamed from: com.coocent.videolibrary.ui.folder.FolderDetailsListActivity$a */
    /* compiled from: FolderDetailsListActivity.kt */
    public static final class C2593a {
        private C2593a() {
        }

        public /* synthetic */ C2593a(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo10083a(Context context, String str, String str2) {
            C8594l.m46771e(context, "context");
            C8594l.m46771e(str, "folderPath");
            C8594l.m46771e(str2, "folderName");
            Intent intent = new Intent(context, FolderDetailsListActivity.class);
            intent.putExtra("folder_path", str);
            intent.putExtra("folder_name", str2);
            context.startActivity(intent);
        }
    }

    public FolderDetailsListActivity() {
        C4616c a = C4615b.m20080a();
        this.f9034C = a == null ? null : a.mo15370a();
    }

    /* renamed from: e1 */
    public void mo5827e1() {
    }

    public void onBackPressed() {
        C4613a aVar = this.f9034C;
        if (aVar != null) {
            aVar.mo15368n(this);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4645q d = C4645q.m20148d(getLayoutInflater());
        C8594l.m46770d(d, "inflate(layoutInflater)");
        this.f9035D = d;
        C2650q qVar = null;
        if (d != null) {
            setContentView((View) d.mo7577a());
            Application application = getApplication();
            C8594l.m46770d(application, "application");
            C0696m0 a = new C0703o0((C0712q0) this, (C0703o0.C0705b) new C4680h(application)).mo4262a(C4681i.class);
            C8594l.m46770d(a, "ViewModelProvider(\n     …aryViewModel::class.java)");
            this.f9036E = (C4681i) a;
            C4645q qVar2 = this.f9035D;
            if (qVar2 != null) {
                qVar2.f13438f.setPopupTheme(C4668q.f13454a.mo15399b(this));
                String stringExtra = getIntent().getStringExtra("folder_path");
                String stringExtra2 = getIntent().getStringExtra("folder_name");
                C4645q qVar3 = this.f9035D;
                if (qVar3 != null) {
                    mo478Y1(qVar3.f13438f);
                    ActionBar R1 = mo471R1();
                    if (R1 != null) {
                        R1.mo426y(stringExtra2);
                    }
                    ActionBar R12 = mo471R1();
                    if (R12 != null) {
                        R12.mo423v(true);
                    }
                    ActionBar R13 = mo471R1();
                    if (R13 != null) {
                        R13.mo421t(true);
                    }
                    C4645q qVar4 = this.f9035D;
                    if (qVar4 != null) {
                        SwipeRefreshLayout swipeRefreshLayout = qVar4.f13437e;
                        swipeRefreshLayout.setColorSchemeColors(C4647b.m20153b(this, C4619a.colorAccent, 0, 4, (Object) null));
                        swipeRefreshLayout.setRefreshing(false);
                        swipeRefreshLayout.setEnabled(false);
                        swipeRefreshLayout.setOnRefreshListener(this);
                        if (C4667p.m20178b(this)) {
                            C4681i iVar = this.f9036E;
                            if (iVar != null) {
                                iVar.mo15409G(true);
                                C4613a aVar = this.f9034C;
                                if (aVar != null) {
                                    C4645q qVar5 = this.f9035D;
                                    if (qVar5 != null) {
                                        FrameLayout frameLayout = qVar5.f13435c;
                                        C8594l.m46770d(frameLayout, "mBinding.layoutAds");
                                        aVar.mo15361g(frameLayout);
                                    } else {
                                        C8594l.m46783q("mBinding");
                                        throw null;
                                    }
                                }
                            } else {
                                C8594l.m46783q("mVideoLibraryViewModel");
                                throw null;
                            }
                        }
                        C0620p i = mo3730H1().mo3957i();
                        C8594l.m46770d(i, "supportFragmentManager.beginTransaction()");
                        Fragment Y = mo3730H1().mo3938Y(stringExtra);
                        if (Y == null) {
                            if (stringExtra != null) {
                                qVar = C2650q.C2651a.m12152c(C2650q.f9118E0, stringExtra, 1, false, (VideoConfigBean) null, 12, (Object) null);
                            }
                            if (qVar != null) {
                                i.mo4069c(C4623e.layout_container, qVar, stringExtra);
                            }
                        } else {
                            i.mo3826v(Y);
                        }
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
        C4613a aVar = this.f9034C;
        if (aVar != null) {
            C4645q qVar = this.f9035D;
            if (qVar != null) {
                FrameLayout frameLayout = qVar.f13435c;
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
        super.onResume();
        C4645q qVar = this.f9035D;
        if (qVar != null) {
            qVar.f13434b.mo10357t(this);
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }
}
