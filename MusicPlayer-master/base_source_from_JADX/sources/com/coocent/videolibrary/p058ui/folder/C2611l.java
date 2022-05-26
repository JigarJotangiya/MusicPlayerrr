package com.coocent.videolibrary.p058ui.folder;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.C0315v;
import androidx.fragment.app.C0602j;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0703o0;
import androidx.lifecycle.C0712q0;
import androidx.lifecycle.C0719w;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.video.videoplayercore.player.PlayerHelper;
import com.coocent.video.videoplayercore.service.AudioPlayService;
import com.coocent.videolibrary.p058ui.C2557e;
import com.coocent.videolibrary.p058ui.C2592f;
import com.coocent.videolibrary.p058ui.C2625g;
import com.coocent.videolibrary.p058ui.C2627h;
import com.coocent.videolibrary.p058ui.encrypted.C2576n;
import com.coocent.videolibrary.p058ui.encrypted.EncryptActivity;
import com.coocent.videolibrary.p058ui.folder.C2604k;
import com.coocent.videolibrary.p058ui.folder.FolderDetailsListActivity;
import com.coocent.videolibrary.p058ui.p059i.C2650q;
import com.coocent.videolibrary.p058ui.search.SearchActivity;
import com.coocent.videoplayer.bean.VideoConfigBean;
import com.coocent.videostore.p067po.Video;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8864k;
import kotlinx.coroutines.C8874l2;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8910t0;
import kotlinx.coroutines.p397f3.C8731d;
import p082e.p083a.p090o.C3432b;
import p082e.p147t.p148e.C4163h0;
import p082e.p147t.p148e.C4165i0;
import p082e.p147t.p148e.C4168j0;
import p082e.p147t.p148e.C4177k0;
import p159f.p166c.p222m.C4613a;
import p159f.p166c.p222m.C4615b;
import p159f.p166c.p222m.C4616c;
import p159f.p166c.p224o.C4619a;
import p159f.p166c.p224o.C4621c;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4625g;
import p159f.p166c.p224o.C4627i;
import p159f.p166c.p224o.p225k.C4630b;
import p159f.p166c.p224o.p226l.C4647b;
import p159f.p166c.p224o.p226l.C4649d;
import p159f.p166c.p224o.p226l.C4655f;
import p159f.p166c.p224o.p226l.C4657g;
import p159f.p166c.p224o.p226l.C4658h;
import p159f.p166c.p224o.p226l.C4663m;
import p159f.p166c.p224o.p226l.C4666o;
import p159f.p166c.p224o.p226l.C4667p;
import p159f.p166c.p224o.p226l.C4668q;
import p159f.p166c.p224o.p227m.C4680h;
import p159f.p166c.p224o.p227m.C4681i;
import p159f.p166c.p224o.p228n.p229b.C4714a;
import p159f.p166c.p224o.p228n.p230c.C4736s;
import p159f.p166c.p224o.p228n.p230c.C4745t;
import p159f.p166c.p231p.p234c.C4814m;
import p159f.p166c.p231p.p234c.C4815n;
import p159f.p243f.p245b.p304b.p317y.C7571b;
import p360h.p361a.p365b.p366a.C8370b;
import p369i.C8446k;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;
import p369i.p387z.p389d.C8606x;

/* renamed from: com.coocent.videolibrary.ui.folder.l */
/* compiled from: FolderFragment.kt */
public final class C2611l extends C2557e {

    /* renamed from: t0 */
    public static final C2612a f9062t0 = new C2612a((C8589g) null);
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public static final String f9063u0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public C4815n f9064h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public C4681i f9065i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public C4168j0<String> f9066j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public C2604k f9067k0;

    /* renamed from: l0 */
    private C4630b f9068l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public C4613a f9069m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public C3432b f9070n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public List<C8446k<String, Boolean>> f9071o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public PlayerHelper f9072p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public ArrayList<Video> f9073q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public final C2614c f9074r0;

    /* renamed from: s0 */
    private final C2615d f9075s0;

    /* renamed from: com.coocent.videolibrary.ui.folder.l$a */
    /* compiled from: FolderFragment.kt */
    public static final class C2612a {
        private C2612a() {
        }

        public /* synthetic */ C2612a(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final String mo10119a() {
            return C2611l.f9063u0;
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.folder.l$b */
    /* compiled from: FolderFragment.kt */
    public static final class C2613b implements C4745t<Integer> {

        /* renamed from: a */
        final /* synthetic */ C2611l f9076a;

        /* renamed from: b */
        final /* synthetic */ List<Video> f9077b;

        C2613b(C2611l lVar, List<? extends Video> list) {
            this.f9076a = lVar;
            this.f9077b = list;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10036a(Object obj) {
            mo10120b(((Number) obj).intValue());
        }

        /* renamed from: b */
        public void mo10120b(int i) {
            if (i == -1) {
                C4815n q3 = this.f9076a.f9064h0;
                if (q3 != null) {
                    q3.mo15548h(this.f9077b);
                    this.f9076a.m11957M3(this.f9077b);
                    C3432b h3 = this.f9076a.f9070n0;
                    if (h3 != null) {
                        h3.mo703c();
                        return;
                    }
                    return;
                }
                C8594l.m46783q("mVideoStoreViewModel");
                throw null;
            }
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.folder.l$c */
    /* compiled from: FolderFragment.kt */
    public static final class C2614c implements C3432b.C3433a {

        /* renamed from: a */
        final /* synthetic */ C2611l f9078a;

        C2614c(C2611l lVar) {
            this.f9078a = lVar;
        }

        /* renamed from: a */
        public void mo592a(C3432b bVar) {
            this.f9078a.f9070n0 = null;
            C4168j0 l3 = this.f9078a.f9066j0;
            if (l3 != null) {
                l3.mo14293e();
                C2604k k3 = this.f9078a.f9067k0;
                if (k3 != null) {
                    k3.mo10092p("no_select_mode");
                    if (this.f9078a.mo3606L() != null && (this.f9078a.mo3705u2() instanceof C2627h)) {
                        ((C2627h) this.f9078a.mo3705u2()).mo10042J(true);
                    }
                    if (this.f9078a.mo3705u2() instanceof C2592f) {
                        ((C2592f) this.f9078a.mo3705u2()).mo10081a(false);
                    }
                    if (this.f9078a.mo3690p0() != null && (this.f9078a.mo3710w2() instanceof C2592f)) {
                        ((C2592f) this.f9078a.mo3710w2()).mo10081a(false);
                        return;
                    }
                    return;
                }
                C8594l.m46783q("mFolderAdapter");
                throw null;
            }
            C8594l.m46783q("mFolderTracker");
            throw null;
        }

        /* renamed from: b */
        public boolean mo593b(C3432b bVar, Menu menu) {
            Window window;
            MenuInflater f;
            if (!(bVar == null || (f = bVar.mo706f()) == null)) {
                f.inflate(C4625g.video_menu_action_mode, menu);
            }
            if (bVar != null) {
                StringBuilder sb = new StringBuilder();
                C4168j0 l3 = this.f9078a.f9066j0;
                if (l3 != null) {
                    sb.append(l3.mo14298j().size());
                    sb.append('/');
                    C2604k k3 = this.f9078a.f9067k0;
                    if (k3 != null) {
                        sb.append(k3.getItemCount());
                        bVar.mo715r(sb.toString());
                    } else {
                        C8594l.m46783q("mFolderAdapter");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("mFolderTracker");
                    throw null;
                }
            }
            if (Build.VERSION.SDK_INT < 21 || (window = this.f9078a.mo3705u2().getWindow()) == null) {
                return true;
            }
            window.setStatusBarColor(C4647b.m20153b(this.f9078a.mo3705u2(), C4619a.colorPrimaryDark, 0, 4, (Object) null));
            return true;
        }

        /* renamed from: c */
        public boolean mo594c(C3432b bVar, Menu menu) {
            if (this.f9078a.mo3606L() != null && (this.f9078a.mo3705u2() instanceof C2627h)) {
                ((C2627h) this.f9078a.mo3705u2()).mo10042J(false);
            }
            if (this.f9078a.mo3606L() != null && (this.f9078a.mo3705u2() instanceof C2592f)) {
                ((C2592f) this.f9078a.mo3705u2()).mo10081a(true);
            }
            if (this.f9078a.mo3690p0() != null && (this.f9078a.mo3710w2() instanceof C2592f)) {
                ((C2592f) this.f9078a.mo3710w2()).mo10081a(true);
            }
            if (menu != null) {
                Context v2 = this.f9078a.mo3708v2();
                C8594l.m46770d(v2, "requireContext()");
                C4663m.m20168a(menu, v2);
            }
            return true;
        }

        /* renamed from: d */
        public boolean mo595d(C3432b bVar, MenuItem menuItem) {
            Integer valueOf = menuItem == null ? null : Integer.valueOf(menuItem.getItemId());
            int i = C4623e.action_select_all;
            if (valueOf != null && valueOf.intValue() == i) {
                C4168j0 l3 = this.f9078a.f9066j0;
                if (l3 != null) {
                    int size = l3.mo14298j().size();
                    C2604k k3 = this.f9078a.f9067k0;
                    if (k3 == null) {
                        C8594l.m46783q("mFolderAdapter");
                        throw null;
                    } else if (size == k3.getItemCount()) {
                        C4168j0 l32 = this.f9078a.f9066j0;
                        if (l32 != null) {
                            l32.mo14293e();
                        } else {
                            C8594l.m46783q("mFolderTracker");
                            throw null;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        C2604k k32 = this.f9078a.f9067k0;
                        if (k32 != null) {
                            for (Video j : k32.mo5380c()) {
                                String j2 = j.mo10551j();
                                C8594l.m46770d(j2, "it.folderPath");
                                arrayList.add(j2);
                            }
                            C4168j0 l33 = this.f9078a.f9066j0;
                            if (l33 != null) {
                                l33.mo14304p(arrayList, true);
                            } else {
                                C8594l.m46783q("mFolderTracker");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mFolderAdapter");
                            throw null;
                        }
                    }
                } else {
                    C8594l.m46783q("mFolderTracker");
                    throw null;
                }
            } else {
                int i2 = C4623e.action_delete;
                if (valueOf != null && valueOf.intValue() == i2) {
                    C4168j0 l34 = this.f9078a.f9066j0;
                    if (l34 == null) {
                        C8594l.m46783q("mFolderTracker");
                        throw null;
                    } else if (l34.mo14298j().isEmpty()) {
                        return true;
                    } else {
                        C4815n q3 = this.f9078a.f9064h0;
                        if (q3 != null) {
                            C4168j0 l35 = this.f9078a.f9066j0;
                            if (l35 != null) {
                                C4163h0 j3 = l35.mo14298j();
                                C8594l.m46770d(j3, "mFolderTracker.selection");
                                q3.mo15553q(C8490t.m46689z(j3));
                            } else {
                                C8594l.m46783q("mFolderTracker");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mVideoStoreViewModel");
                            throw null;
                        }
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.folder.l$d */
    /* compiled from: FolderFragment.kt */
    public static final class C2615d implements C2604k.C2610e {

        /* renamed from: a */
        final /* synthetic */ C2611l f9079a;

        C2615d(C2611l lVar) {
            this.f9079a = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final boolean m12012e(C2611l lVar, Video video, MenuItem menuItem) {
            C8594l.m46771e(lVar, "this$0");
            C8594l.m46771e(video, "$video");
            int itemId = menuItem.getItemId();
            if (itemId == C4623e.action_play_all) {
                C4815n q3 = lVar.f9064h0;
                if (q3 != null) {
                    String j = video.mo10551j();
                    C8594l.m46770d(j, "video.folderPath");
                    LiveData<List<Video>> C = q3.mo15541C(j, (C8446k) lVar.f9071o0.get(1), false);
                    C.mo4149h(lVar.mo3607L0(), new C2600g(lVar, C));
                } else {
                    C8594l.m46783q("mVideoStoreViewModel");
                    throw null;
                }
            } else if (itemId == C4623e.action_delete) {
                C4815n q32 = lVar.f9064h0;
                if (q32 != null) {
                    q32.mo15553q(C8481k.m46661b(video.mo10551j()));
                } else {
                    C8594l.m46783q("mVideoStoreViewModel");
                    throw null;
                }
            }
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final void m12013f(C2611l lVar, LiveData liveData, List list) {
            C8594l.m46771e(lVar, "this$0");
            C8594l.m46771e(liveData, "$liveData");
            C4613a o3 = lVar.f9069m0;
            if (o3 != null) {
                C8594l.m46770d(list, "videoList");
                if (!list.isEmpty()) {
                    Context v2 = lVar.mo3708v2();
                    C8594l.m46770d(v2, "requireContext()");
                    o3.mo15369o(v2, (Parcelable) list.get(0));
                    Context v22 = lVar.mo3708v2();
                    C8594l.m46770d(v22, "requireContext()");
                    VideoConfigBean.C2691a aVar = new VideoConfigBean.C2691a();
                    aVar.mo10229g(C8606x.m46797a(list));
                    aVar.mo10231i(0);
                    o3.mo15360f(v22, aVar.mo10223a());
                }
            }
            liveData.mo4155n(lVar.mo3607L0());
        }

        /* renamed from: a */
        public void mo10109a(Video video, int i) {
            C8594l.m46771e(video, "video");
            if (this.f9079a.f9070n0 == null) {
                if (this.f9079a.f9069m0 != null) {
                    C4613a o3 = this.f9079a.f9069m0;
                    C8594l.m46769c(o3);
                    if (o3.mo15366l()) {
                        FolderDetailsListActivity.C2593a aVar = FolderDetailsListActivity.f9033F;
                        Context v2 = this.f9079a.mo3708v2();
                        C8594l.m46770d(v2, "requireContext()");
                        String j = video.mo10551j();
                        C8594l.m46770d(j, "video.folderPath");
                        String i2 = video.mo10550i();
                        C8594l.m46770d(i2, "video.folderName");
                        aVar.mo10083a(v2, j, i2);
                        if (this.f9079a.mo3705u2() instanceof C2592f) {
                            ((C2592f) this.f9079a.mo3705u2()).mo10081a(false);
                        }
                        if (this.f9079a.mo3690p0() != null && (this.f9079a.mo3710w2() instanceof C2592f)) {
                            ((C2592f) this.f9079a.mo3710w2()).mo10081a(false);
                            return;
                        }
                        return;
                    }
                }
                if (this.f9079a.mo3705u2() instanceof C2592f) {
                    ((C2592f) this.f9079a.mo3705u2()).mo10081a(true);
                }
                if (this.f9079a.mo3690p0() != null && (this.f9079a.mo3710w2() instanceof C2592f)) {
                    ((C2592f) this.f9079a.mo3710w2()).mo10081a(true);
                }
                C0620p i3 = this.f9079a.mo3693q0().mo3957i();
                C8594l.m46770d(i3, "parentFragmentManager.beginTransaction()");
                Fragment Y = this.f9079a.mo3693q0().mo3938Y(video.mo10551j());
                if (Y == null) {
                    C2650q.C2651a aVar2 = C2650q.f9118E0;
                    String j2 = video.mo10551j();
                    C8594l.m46770d(j2, "video.folderPath");
                    Y = C2650q.C2651a.m12152c(aVar2, j2, 1, false, (VideoConfigBean) null, 12, (Object) null);
                }
                i3.mo4069c(C4623e.layout_container, Y, video.mo10551j());
                i3.mo4073g(video.mo10551j());
                Fragment Y2 = this.f9079a.mo3693q0().mo3938Y(C2611l.f9062t0.mo10119a());
                if (Y2 != null) {
                    i3.mo3821p(Y2);
                }
                i3.mo3826v(Y);
                i3.mo3815i();
                C4613a o32 = this.f9079a.f9069m0;
                if (o32 != null) {
                    FragmentActivity u2 = this.f9079a.mo3705u2();
                    C8594l.m46770d(u2, "requireActivity()");
                    o32.mo15368n(u2);
                    return;
                }
                return;
            }
            C4168j0 l3 = this.f9079a.f9066j0;
            if (l3 != null) {
                l3.mo14304p(C8482l.m46668i(video.mo10551j()), true);
                return;
            }
            C8594l.m46783q("mFolderTracker");
            throw null;
        }

        /* renamed from: b */
        public void mo10110b(View view, Video video, int i) {
            C8594l.m46771e(view, "view");
            C8594l.m46771e(video, "video");
            C0315v vVar = new C0315v(this.f9079a.mo3708v2(), view, 8388613);
            C2611l lVar = this.f9079a;
            vVar.mo2141c(C4625g.video_menu_folder_item);
            vVar.mo2142d(new C2601h(lVar, video));
            vVar.mo2143e();
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.folder.l$e */
    /* compiled from: FolderFragment.kt */
    public static final class C2616e implements C4745t<String> {

        /* renamed from: a */
        final /* synthetic */ boolean f9080a;

        /* renamed from: b */
        final /* synthetic */ C2611l f9081b;

        C2616e(boolean z, C2611l lVar) {
            this.f9080a = z;
            this.f9081b = lVar;
        }

        /* renamed from: b */
        public void mo10036a(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (this.f9080a) {
                SearchActivity.C2683a aVar = SearchActivity.f9167E;
                FragmentActivity u2 = this.f9081b.mo3705u2();
                C8594l.m46770d(u2, "requireActivity()");
                aVar.mo10185a(u2, str);
                return;
            }
            if (this.f9081b.mo3606L() != null && (this.f9081b.mo3705u2() instanceof C2627h)) {
                String D0 = this.f9081b.mo3582D0(C4627i.coocent_search);
                C8594l.m46770d(D0, "getString(R.string.coocent_search)");
                ((C2627h) this.f9081b.mo3705u2()).mo10046v0(D0);
            }
            if (this.f9081b.mo3690p0() != null && (this.f9081b.mo3710w2() instanceof C2627h)) {
                String D02 = this.f9081b.mo3582D0(C4627i.coocent_search);
                C8594l.m46770d(D02, "getString(R.string.coocent_search)");
                ((C2627h) this.f9081b.mo3710w2()).mo10046v0(D02);
            }
            C0620p i = this.f9081b.mo3693q0().mo3957i();
            C8594l.m46770d(i, "parentFragmentManager.beginTransaction()");
            Fragment Y = this.f9081b.mo3693q0().mo3938Y(str);
            if (Y == null) {
                C2650q.C2651a aVar2 = C2650q.f9118E0;
                C8594l.m46769c(str);
                Y = C2650q.C2651a.m12152c(aVar2, str, 2, false, (VideoConfigBean) null, 12, (Object) null);
            }
            i.mo4069c(C4623e.layout_container, Y, str);
            i.mo4073g(str);
            Fragment Y2 = this.f9081b.mo3693q0().mo3938Y(C2611l.f9062t0.mo10119a());
            if (Y2 != null) {
                i.mo3821p(Y2);
            }
            i.mo3826v(Y);
            i.mo3815i();
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.folder.l$f */
    /* compiled from: FolderFragment.kt */
    public static final class C2617f implements C4745t<C8446k<? extends String, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C2611l f9082a;

        C2617f(C2611l lVar) {
            this.f9082a = lVar;
        }

        /* renamed from: b */
        public void mo10036a(C8446k<String, Boolean> kVar) {
            C8594l.m46771e(kVar, "result");
            C4681i p3 = this.f9082a.f9065i0;
            if (p3 != null) {
                p3.mo15408F(kVar.getFirst(), kVar.getSecond().booleanValue(), true, false);
            } else {
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
        }
    }

    @C8533f(mo30599c = "com.coocent.videolibrary.ui.folder.FolderFragment$onEncrypted$1", mo30600f = "FolderFragment.kt", mo30601l = {768, 682}, mo30602m = "invokeSuspend")
    /* renamed from: com.coocent.videolibrary.ui.folder.l$g */
    /* compiled from: FolderFragment.kt */
    static final class C2618g extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        boolean Z$0;
        int label;
        final /* synthetic */ C2611l this$0;

        @C8533f(mo30599c = "com.coocent.videolibrary.ui.folder.FolderFragment$onEncrypted$1$1", mo30600f = "FolderFragment.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: com.coocent.videolibrary.ui.folder.l$g$a */
        /* compiled from: FolderFragment.kt */
        static final class C2619a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
            final /* synthetic */ boolean $isNight;
            final /* synthetic */ String $success;
            int label;
            final /* synthetic */ C2611l this$0;

            /* renamed from: com.coocent.videolibrary.ui.folder.l$g$a$a */
            /* compiled from: FolderFragment.kt */
            public static final class C2620a implements C4745t<Integer> {

                /* renamed from: a */
                final /* synthetic */ C2611l f9083a;

                /* renamed from: b */
                final /* synthetic */ boolean f9084b;

                C2620a(C2611l lVar, boolean z) {
                    this.f9083a = lVar;
                    this.f9084b = z;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ void mo10036a(Object obj) {
                    mo10125b(((Number) obj).intValue());
                }

                /* renamed from: b */
                public void mo10125b(int i) {
                    if (i == 17039370) {
                        EncryptActivity.C2559a aVar = EncryptActivity.f8973L;
                        Context v2 = this.f9083a.mo3708v2();
                        C8594l.m46770d(v2, "requireContext()");
                        EncryptActivity.C2559a.m11826d(aVar, v2, this.f9084b, false, (C2576n) null, 12, (Object) null);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2619a(String str, C2611l lVar, boolean z, C8508d<? super C2619a> dVar) {
                super(2, dVar);
                this.$success = str;
                this.this$0 = lVar;
                this.$isNight = z;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                return new C2619a(this.$success, this.this$0, this.$isNight, dVar);
            }

            public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
                return ((C2619a) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    if (TextUtils.isEmpty(this.$success)) {
                        C4736s sVar = C4736s.f13541a;
                        String string = this.this$0.mo3708v2().getString(C4627i.video_first_encrypt_dialog_message);
                        C8594l.m46770d(string, "requireContext().getStri…                        )");
                        C0602j q0 = this.this$0.mo3693q0();
                        C8594l.m46770d(q0, "parentFragmentManager");
                        sVar.mo15460c((String) null, string, q0, new C2620a(this.this$0, this.$isNight));
                    } else {
                        EncryptActivity.C2559a aVar = EncryptActivity.f8973L;
                        Context v2 = this.this$0.mo3708v2();
                        C8594l.m46770d(v2, "requireContext()");
                        EncryptActivity.C2559a.m11826d(aVar, v2, this.$isNight, false, (C2576n) null, 12, (Object) null);
                    }
                    return C8457t.f34900a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2618g(C2611l lVar, C8508d<? super C2618g> dVar) {
            super(2, dVar);
            this.this$0 = lVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C2618g(this.this$0, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C2618g) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C4668q.C4669a aVar = C4668q.f13454a;
                Context v2 = this.this$0.mo3708v2();
                C8594l.m46770d(v2, "requireContext()");
                z = aVar.mo15404j(v2);
                C4655f fVar = C4655f.f13444a;
                Context v22 = this.this$0.mo3708v2();
                C8594l.m46770d(v22, "requireContext()");
                C4649d dVar = new C4649d(C4657g.m20158a(v22).mo13321b());
                this.Z$0 = z;
                this.label = 1;
                obj = C8731d.m47259d(dVar, this);
                if (obj == d) {
                    return d;
                }
            } else if (i == 1) {
                z = this.Z$0;
                C8450m.m46575b(obj);
            } else if (i == 2) {
                C8450m.m46575b(obj);
                return C8457t.f34900a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C8874l2 c = C8768g1.m47303c();
            C2619a aVar2 = new C2619a((String) obj, this.this$0, z, (C8508d<? super C2619a>) null);
            this.label = 2;
            if (C8864k.m47676e(c, aVar2, this) == d) {
                return d;
            }
            return C8457t.f34900a;
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.folder.l$h */
    /* compiled from: FolderFragment.kt */
    public static final class C2621h extends C4168j0.C4174b<String> {

        /* renamed from: a */
        final /* synthetic */ C2611l f9085a;

        C2621h(C2611l lVar) {
            this.f9085a = lVar;
        }

        /* renamed from: b */
        public void mo10079b() {
            Menu e;
            Menu e2;
            super.mo10079b();
            C4168j0 l3 = this.f9085a.f9066j0;
            if (l3 != null) {
                boolean z = true;
                if (!l3.mo14298j().isEmpty()) {
                    if (this.f9085a.f9070n0 == null) {
                        C2611l lVar = this.f9085a;
                        lVar.f9070n0 = ((AppCompatActivity) lVar.mo3705u2()).mo479Z1(this.f9085a.f9074r0);
                    }
                    C3432b h3 = this.f9085a.f9070n0;
                    if (!(h3 == null || (e2 = h3.mo705e()) == null)) {
                        Context v2 = this.f9085a.mo3708v2();
                        C8594l.m46770d(v2, "requireContext()");
                        C4168j0 l32 = this.f9085a.f9066j0;
                        if (l32 != null) {
                            int size = l32.mo14298j().size();
                            C2604k k3 = this.f9085a.f9067k0;
                            if (k3 != null) {
                                if (size != k3.getItemCount()) {
                                    z = false;
                                }
                                C4663m.m20169b(e2, v2, z);
                            } else {
                                C8594l.m46783q("mFolderAdapter");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mFolderTracker");
                            throw null;
                        }
                    }
                    C3432b h32 = this.f9085a.f9070n0;
                    if (h32 != null) {
                        StringBuilder sb = new StringBuilder();
                        C4168j0 l33 = this.f9085a.f9066j0;
                        if (l33 != null) {
                            sb.append(l33.mo14298j().size());
                            sb.append('/');
                            C2604k k32 = this.f9085a.f9067k0;
                            if (k32 != null) {
                                sb.append(k32.getItemCount());
                                h32.mo715r(sb.toString());
                            } else {
                                C8594l.m46783q("mFolderAdapter");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mFolderTracker");
                            throw null;
                        }
                    }
                    C2604k k33 = this.f9085a.f9067k0;
                    if (k33 == null) {
                        C8594l.m46783q("mFolderAdapter");
                        throw null;
                    } else if (C8594l.m46767a(k33.mo10086j(), "no_select_mode")) {
                        C2604k k34 = this.f9085a.f9067k0;
                        if (k34 != null) {
                            k34.mo10092p("select_mode");
                        } else {
                            C8594l.m46783q("mFolderAdapter");
                            throw null;
                        }
                    }
                } else if (this.f9085a.f9070n0 == null) {
                    C2604k k35 = this.f9085a.f9067k0;
                    if (k35 == null) {
                        C8594l.m46783q("mFolderAdapter");
                        throw null;
                    } else if (C8594l.m46767a(k35.mo10086j(), "select_mode")) {
                        C2604k k36 = this.f9085a.f9067k0;
                        if (k36 != null) {
                            k36.mo10092p("no_select_mode");
                        } else {
                            C8594l.m46783q("mFolderAdapter");
                            throw null;
                        }
                    }
                } else {
                    C3432b h33 = this.f9085a.f9070n0;
                    if (!(h33 == null || (e = h33.mo705e()) == null)) {
                        Context v22 = this.f9085a.mo3708v2();
                        C8594l.m46770d(v22, "requireContext()");
                        C4168j0 l34 = this.f9085a.f9066j0;
                        if (l34 != null) {
                            int size2 = l34.mo14298j().size();
                            C2604k k37 = this.f9085a.f9067k0;
                            if (k37 != null) {
                                if (size2 != k37.getItemCount()) {
                                    z = false;
                                }
                                C4663m.m20169b(e, v22, z);
                            } else {
                                C8594l.m46783q("mFolderAdapter");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mFolderTracker");
                            throw null;
                        }
                    }
                    C3432b h34 = this.f9085a.f9070n0;
                    if (h34 != null) {
                        StringBuilder sb2 = new StringBuilder();
                        C4168j0 l35 = this.f9085a.f9066j0;
                        if (l35 != null) {
                            sb2.append(l35.mo14298j().size());
                            sb2.append('/');
                            C2604k k38 = this.f9085a.f9067k0;
                            if (k38 != null) {
                                sb2.append(k38.getItemCount());
                                h34.mo715r(sb2.toString());
                            } else {
                                C8594l.m46783q("mFolderAdapter");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mFolderTracker");
                            throw null;
                        }
                    }
                    C2604k k39 = this.f9085a.f9067k0;
                    if (k39 == null) {
                        C8594l.m46783q("mFolderAdapter");
                        throw null;
                    } else if (C8594l.m46767a(k39.mo10086j(), "no_select_mode")) {
                        C2604k k310 = this.f9085a.f9067k0;
                        if (k310 != null) {
                            k310.mo10092p("un_select_mode");
                        } else {
                            C8594l.m46783q("mFolderAdapter");
                            throw null;
                        }
                    }
                }
            } else {
                C8594l.m46783q("mFolderTracker");
                throw null;
            }
        }
    }

    @C8533f(mo30599c = "com.coocent.videolibrary.ui.folder.FolderFragment$releasePlayBack$1$1", mo30600f = "FolderFragment.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: com.coocent.videolibrary.ui.folder.l$i */
    /* compiled from: FolderFragment.kt */
    static final class C2622i extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ List<Video> $deleteList;
        final /* synthetic */ PlayerHelper $this_apply;
        int label;
        final /* synthetic */ C2611l this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2622i(C2611l lVar, List<? extends Video> list, PlayerHelper playerHelper, C8508d<? super C2622i> dVar) {
            super(2, dVar);
            this.this$0 = lVar;
            this.$deleteList = list;
            this.$this_apply = playerHelper;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C2622i(this.this$0, this.$deleteList, this.$this_apply, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C2622i) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                C4815n q3 = this.this$0.f9064h0;
                if (q3 != null) {
                    Video v = q3.mo15558v(false);
                    if (v != null) {
                        List<Video> list = this.$deleteList;
                        PlayerHelper playerHelper = this.$this_apply;
                        for (Video l : list) {
                            if (v.mo10553l() == l.mo10553l()) {
                                playerHelper.saveVideoInfo();
                            }
                        }
                    }
                    return C8457t.f34900a;
                }
                C8594l.m46783q("mVideoStoreViewModel");
                throw null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.folder.l$j */
    /* compiled from: FolderFragment.kt */
    static final class C2623j extends C8595m implements C8570l<List<? extends Parcelable>, C8457t> {
        final /* synthetic */ C2611l this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2623j(C2611l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends Parcelable>) (List) obj);
            return C8457t.f34900a;
        }

        public final void invoke(List<? extends Parcelable> list) {
            C8594l.m46771e(list, "it");
            C2611l lVar = this.this$0;
            lVar.m11983u3(lVar.f9073q0);
        }
    }

    @C8533f(mo30599c = "com.coocent.videolibrary.ui.folder.FolderFragment$subscribeUI$8", mo30600f = "FolderFragment.kt", mo30601l = {604}, mo30602m = "invokeSuspend")
    /* renamed from: com.coocent.videolibrary.ui.folder.l$k */
    /* compiled from: FolderFragment.kt */
    static final class C2624k extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        int label;
        final /* synthetic */ C2611l this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2624k(C2611l lVar, C8508d<? super C2624k> dVar) {
            super(2, dVar);
            this.this$0 = lVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C2624k(this.this$0, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C2624k) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                PlayerHelper m3 = this.this$0.f9072p0;
                if (m3 != null) {
                    this.label = 1;
                    obj = m3.getLastPlayVideoPath(this);
                    if (obj == d) {
                        return d;
                    }
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
            } else if (i == 1) {
                C8450m.m46575b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) obj;
            C2604k k3 = this.this$0.f9067k0;
            if (k3 != null) {
                k3.mo10090n(str);
                return C8457t.f34900a;
            }
            C8594l.m46783q("mFolderAdapter");
            throw null;
        }
    }

    static {
        String canonicalName = C2611l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "FolderFragment";
        }
        f9063u0 = canonicalName;
    }

    public C2611l() {
        C4616c a = C4615b.m20080a();
        this.f9069m0 = a == null ? null : a.mo15370a();
        Boolean bool = Boolean.FALSE;
        this.f9071o0 = C8482l.m46667h(new C8446k("date_modified", bool), new C8446k("date_modified", bool));
        this.f9073q0 = new ArrayList<>();
        this.f9074r0 = new C2614c(this);
        this.f9075s0 = new C2615d(this);
    }

    /* renamed from: E3 */
    private final void m11955E3() {
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        if (C4667p.m20178b(v2)) {
            C4681i iVar = this.f9065i0;
            if (iVar != null) {
                iVar.mo15412h(0);
            } else {
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
        }
    }

    /* renamed from: F3 */
    private final void m11956F3() {
        mo3705u2().onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public final void m11957M3(List<? extends Video> list) {
        PlayerHelper playerHelper = this.f9072p0;
        if (playerHelper == null) {
            C8594l.m46783q("mPlayerHelper");
            throw null;
        } else if (playerHelper.isAudioPlay() || playerHelper.isWindows()) {
            playerHelper.deleteVideoList(C8606x.m46797a(list));
            if (playerHelper.isAudioPlay() && playerHelper.getVideo() == null) {
                mo3708v2().sendBroadcast(new Intent(AudioPlayService.Companion.getNOTIFICATION_RELEASE()));
            } else if (playerHelper.isWindows() && playerHelper.getVideo() == null) {
                playerHelper.savePlayingVideoIdAndPath(false);
                playerHelper.setWindows(false);
                C4613a aVar = this.f9069m0;
                if (aVar != null) {
                    Application application = mo3705u2().getApplication();
                    C8594l.m46770d(application, "requireActivity().application");
                    aVar.mo15364j(application, true);
                }
                playerHelper.closeWindow();
                playerHelper.release();
            }
        } else {
            C8665a2 unused = C8875m.m47725b(C0719w.m4282a(this), C8768g1.m47302b(), (C8910t0) null, new C2622i(this, list, playerHelper, (C8508d<? super C2622i>) null), 2, (Object) null);
        }
    }

    /* renamed from: N3 */
    private final void m11958N3(int i, List<Video> list) {
        C4666o oVar = C4666o.f13452a;
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        C2604k kVar = this.f9067k0;
        if (kVar != null) {
            List c = kVar.mo5380c();
            C8594l.m46770d(c, "mFolderAdapter.currentList");
            oVar.mo15397a(v2, i, list, C8490t.m46678C(c));
            return;
        }
        C8594l.m46783q("mFolderAdapter");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public static final void m11959O3(C2611l lVar, View view) {
        C8594l.m46771e(lVar, "this$0");
        if (lVar.mo3705u2() instanceof C2625g) {
            C2625g.C2626a.m12024a((C2625g) lVar.mo3705u2(), false, 1, (Object) null);
            return;
        }
        Context v2 = lVar.mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        if (C4667p.m20178b(v2)) {
            lVar.m11967c3();
        } else {
            lVar.mo10050d3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public static final void m11960P3(C2611l lVar, Integer num) {
        C8594l.m46771e(lVar, "this$0");
        int v3 = lVar.mo10118v3();
        if (num == null || num.intValue() != v3) {
            if (num != null && num.intValue() == 1) {
                C4630b bVar = lVar.f9068l0;
                if (bVar != null) {
                    bVar.f13361f.setLayoutManager(new GridLayoutManager(lVar.mo3708v2(), 2, 1, false));
                } else {
                    C8594l.m46783q("mVideoFragmentFolderBinding");
                    throw null;
                }
            } else if (num != null && num.intValue() == 0) {
                C4630b bVar2 = lVar.f9068l0;
                if (bVar2 != null) {
                    bVar2.f13361f.setLayoutManager(new LinearLayoutManager(lVar.mo3708v2(), 1, false));
                } else {
                    C8594l.m46783q("mVideoFragmentFolderBinding");
                    throw null;
                }
            }
            C2604k kVar = lVar.f9067k0;
            if (kVar != null) {
                C8594l.m46770d(num, "viewType");
                kVar.mo10094r(num.intValue());
                return;
            }
            C8594l.m46783q("mFolderAdapter");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public static final void m11961Q3(C2611l lVar, List list) {
        C8594l.m46771e(lVar, "this$0");
        C4630b bVar = lVar.f9068l0;
        if (bVar != null) {
            LinearLayout linearLayout = bVar.f13359d;
            C8594l.m46770d(linearLayout, "mVideoFragmentFolderBinding.layoutFolderEmpty");
            linearLayout.setVisibility(list.isEmpty() ? 0 : 8);
            C2604k kVar = lVar.f9067k0;
            if (kVar != null) {
                kVar.mo5382e(list);
            } else {
                C8594l.m46783q("mFolderAdapter");
                throw null;
            }
        } else {
            C8594l.m46783q("mVideoFragmentFolderBinding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public static final void m11962R3(C2611l lVar, List list) {
        C8594l.m46771e(lVar, "this$0");
        lVar.f9073q0.clear();
        Objects.requireNonNull(list, "null cannot be cast to non-null type java.util.ArrayList<com.coocent.videostore.po.Video>{ kotlin.collections.TypeAliasesKt.ArrayList<com.coocent.videostore.po.Video> }");
        lVar.f9073q0 = (ArrayList) list;
        C4613a aVar = lVar.f9069m0;
        if (aVar != null) {
            FragmentActivity u2 = lVar.mo3705u2();
            C8594l.m46770d(u2, "requireActivity()");
            aVar.mo15367m(u2, list, new C2623j(lVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public static final void m11963S3(C2611l lVar, Object obj) {
        C8594l.m46771e(lVar, "this$0");
        if (obj == null) {
            Toast.makeText(lVar.mo3708v2(), C4627i.coocent_video_delete_successfully, 0).show();
        } else if (Build.VERSION.SDK_INT < 30) {
            Toast.makeText(lVar.mo3708v2(), C4627i.coocent_video_delete_failed, 0).show();
        } else if (obj instanceof PendingIntent) {
            lVar.mo3641V2(((PendingIntent) obj).getIntentSender(), 1114, (Intent) null, 0, 0, 0, (Bundle) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public static final void m11964T3(C2611l lVar, Boolean bool) {
        C8594l.m46771e(lVar, "this$0");
        C4681i iVar = lVar.f9065i0;
        if (iVar != null) {
            iVar.mo15415k().mo4149h(lVar.mo3607L0(), new C2598e(lVar, bool));
        } else {
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public static final void m11965U3(C2611l lVar, Boolean bool, List list) {
        C8594l.m46771e(lVar, "this$0");
        C8594l.m46770d(list, "it");
        lVar.f9071o0 = list;
        C8594l.m46770d(bool, "granted");
        if (bool.booleanValue()) {
            C4815n nVar = lVar.f9064h0;
            if (nVar != null) {
                nVar.mo15556t(list, false);
            } else {
                C8594l.m46783q("mVideoStoreViewModel");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V3 */
    public static final void m11966V3(C2611l lVar, Boolean bool) {
        C8594l.m46771e(lVar, "this$0");
        C4630b bVar = lVar.f9068l0;
        if (bVar != null) {
            LinearLayout linearLayout = bVar.f13360e;
            C8594l.m46770d(linearLayout, "mVideoFragmentFolderBinding.layoutPermission");
            C8594l.m46770d(bool, "it");
            linearLayout.setVisibility(bool.booleanValue() ? 0 : 8);
            return;
        }
        C8594l.m46783q("mVideoFragmentFolderBinding");
        throw null;
    }

    /* renamed from: c3 */
    private final void m11967c3() {
        C4681i iVar = this.f9065i0;
        if (iVar != null) {
            iVar.mo15406D(false);
            C4681i iVar2 = this.f9065i0;
            if (iVar2 != null) {
                iVar2.mo15409G(true);
                C4681i iVar3 = this.f9065i0;
                if (iVar3 != null) {
                    iVar3.mo15410H(false);
                    if (C4658h.m20159a() >= 5242880) {
                        C4815n nVar = this.f9064h0;
                        if (nVar != null) {
                            nVar.mo15543S();
                        } else {
                            C8594l.m46783q("mVideoStoreViewModel");
                            throw null;
                        }
                    } else {
                        if (mo3606L() != null && (mo3705u2() instanceof C2627h)) {
                            ((C2627h) mo3705u2()).mo10045s1(false);
                        }
                        Toast.makeText(mo3708v2(), "Internal storage has not enough space", 0).show();
                    }
                } else {
                    C8594l.m46783q("mVideoLibraryViewModel");
                    throw null;
                }
            } else {
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
        } else {
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
    }

    /* renamed from: e3 */
    private final void m11968e3() {
        FragmentActivity u2 = mo3705u2();
        Application application = mo3705u2().getApplication();
        C8594l.m46770d(application, "requireActivity().application");
        C0696m0 a = new C0703o0((C0712q0) u2, (C0703o0.C0705b) new C4814m(application)).mo4262a(C4815n.class);
        C8594l.m46770d(a, "ViewModelProvider(\n     …oreViewModel::class.java)");
        this.f9064h0 = (C4815n) a;
        FragmentActivity u22 = mo3705u2();
        Application application2 = mo3705u2().getApplication();
        C8594l.m46770d(application2, "requireActivity().application");
        C0696m0 a2 = new C0703o0((C0712q0) u22, (C0703o0.C0705b) new C4680h(application2)).mo4262a(C4681i.class);
        C8594l.m46770d(a2, "ViewModelProvider(\n     …aryViewModel::class.java)");
        this.f9065i0 = (C4681i) a2;
        C4815n nVar = this.f9064h0;
        if (nVar != null) {
            nVar.mo15557u().mo4149h(mo3607L0(), new C2595b(this));
            C4815n nVar2 = this.f9064h0;
            if (nVar2 != null) {
                nVar2.mo15554r().mo4149h(mo3607L0(), new C2603j(this));
                C4815n nVar3 = this.f9064h0;
                if (nVar3 != null) {
                    nVar3.mo15552p().mo4149h(mo3607L0(), new C2597d(this));
                    C4681i iVar = this.f9065i0;
                    if (iVar != null) {
                        iVar.mo15419o().mo4149h(mo3607L0(), new C2594a(this));
                        C4681i iVar2 = this.f9065i0;
                        if (iVar2 != null) {
                            iVar2.mo15418n().mo4149h(mo3607L0(), new C2599f(this));
                            C4630b bVar = this.f9068l0;
                            if (bVar != null) {
                                bVar.f13357b.setOnClickListener(new C2596c(this));
                                C4681i iVar3 = this.f9065i0;
                                if (iVar3 != null) {
                                    iVar3.mo15421q().mo4149h(mo3607L0(), new C2602i(this));
                                    C8665a2 unused = C8875m.m47725b(C0719w.m4282a(this), C8768g1.m47303c(), (C8910t0) null, new C2624k(this, (C8508d<? super C2624k>) null), 2, (Object) null);
                                    return;
                                }
                                C8594l.m46783q("mVideoLibraryViewModel");
                                throw null;
                            }
                            C8594l.m46783q("mVideoFragmentFolderBinding");
                            throw null;
                        }
                        C8594l.m46783q("mVideoLibraryViewModel");
                        throw null;
                    }
                    C8594l.m46783q("mVideoLibraryViewModel");
                    throw null;
                }
                C8594l.m46783q("mVideoStoreViewModel");
                throw null;
            }
            C8594l.m46783q("mVideoStoreViewModel");
            throw null;
        }
        C8594l.m46783q("mVideoStoreViewModel");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public final void m11983u3(List<? extends Video> list) {
        if (Build.VERSION.SDK_INT >= 30) {
            C4815n nVar = this.f9064h0;
            if (nVar != null) {
                nVar.mo15548h(list);
                C3432b bVar = this.f9070n0;
                if (bVar != null) {
                    bVar.mo703c();
                    return;
                }
                return;
            }
            C8594l.m46783q("mVideoStoreViewModel");
            throw null;
        }
        C4736s sVar = C4736s.f13541a;
        C0602j q0 = mo3693q0();
        C8594l.m46770d(q0, "parentFragmentManager");
        sVar.mo15459b(q0, new C2613b(this, list));
    }

    /* renamed from: F1 */
    public void mo3589F1(boolean z) {
        super.mo3589F1(z);
        if (!z) {
            if (mo3606L() != null && (mo3705u2() instanceof C2627h)) {
                String D0 = mo3582D0(C4627i.coocent_mime_type_folder);
                C8594l.m46770d(D0, "getString(R.string.coocent_mime_type_folder)");
                ((C2627h) mo3705u2()).mo10046v0(D0);
            }
            if (mo3690p0() != null && (mo3710w2() instanceof C2627h)) {
                String D02 = mo3582D0(C4627i.coocent_mime_type_folder);
                C8594l.m46770d(D02, "getString(\n             …der\n                    )");
                ((C2627h) mo3710w2()).mo10046v0(D02);
            }
        }
    }

    /* renamed from: G3 */
    public final void mo10111G3(boolean z) {
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        if (!C4667p.m20178b(v2)) {
            mo10050d3();
            return;
        }
        C4736s sVar = C4736s.f13541a;
        C0602j q0 = mo3693q0();
        C8594l.m46770d(q0, "parentFragmentManager");
        sVar.mo15464g(q0, new C2616e(z, this));
    }

    /* renamed from: H3 */
    public final void mo10112H3() {
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        if (C4667p.m20178b(v2)) {
            ArrayList arrayList = new ArrayList();
            C2604k kVar = this.f9067k0;
            if (kVar != null) {
                for (Video j : kVar.mo5380c()) {
                    String j2 = j.mo10551j();
                    C8594l.m46770d(j2, "it.folderPath");
                    arrayList.add(j2);
                }
                C4168j0<String> j0Var = this.f9066j0;
                if (j0Var != null) {
                    j0Var.mo14304p(arrayList, true);
                } else {
                    C8594l.m46783q("mFolderTracker");
                    throw null;
                }
            } else {
                C8594l.m46783q("mFolderAdapter");
                throw null;
            }
        }
    }

    /* renamed from: I3 */
    public final void mo10113I3() {
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        if (C4667p.m20178b(v2)) {
            C4736s sVar = C4736s.f13541a;
            C0602j q0 = mo3693q0();
            C8594l.m46770d(q0, "parentFragmentManager");
            sVar.mo15466i(q0, 1, (String) this.f9071o0.get(0).getFirst(), ((Boolean) this.f9071o0.get(0).getSecond()).booleanValue(), new C2617f(this));
        }
    }

    /* renamed from: J1 */
    public boolean mo3601J1(MenuItem menuItem) {
        boolean z;
        C8594l.m46771e(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            m11956F3();
        } else if (itemId == C4623e.action_search) {
            C4613a aVar = this.f9069m0;
            if (aVar != null) {
                C8594l.m46769c(aVar);
                if (aVar.mo15366l()) {
                    z = true;
                    mo10111G3(z);
                }
            }
            z = false;
            mo10111G3(z);
        } else if (itemId == C4623e.action_select_all) {
            mo10112H3();
        } else if (itemId == C4623e.action_encrypted) {
            mo10116L3();
        } else if (itemId == C4623e.action_function) {
            m11955E3();
        } else if (itemId == C4623e.action_sort) {
            mo10113I3();
        } else if (itemId == C4623e.action_view_list) {
            mo10115K3();
        } else if (itemId == C4623e.action_view_grid) {
            mo10114J3();
        }
        return super.mo3601J1(menuItem);
    }

    /* renamed from: J3 */
    public final void mo10114J3() {
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        if (C4667p.m20178b(v2)) {
            mo10117W3(1);
        }
    }

    /* renamed from: K3 */
    public final void mo10115K3() {
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        if (C4667p.m20178b(v2)) {
            mo10117W3(0);
        }
    }

    /* renamed from: L3 */
    public final void mo10116L3() {
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        if (!C4667p.m20178b(v2)) {
            mo10050d3();
        } else {
            C8665a2 unused = C8875m.m47725b(C0719w.m4282a(this), C8768g1.m47302b(), (C8910t0) null, new C2618g(this, (C8508d<? super C2618g>) null), 2, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        if (r0.mo15366l() == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002c, code lost:
        if (r2.mo15362h() != false) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004d  */
    /* renamed from: N1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3614N1(android.view.Menu r6) {
        /*
            r5 = this;
            java.lang.String r0 = "menu"
            p369i.p387z.p389d.C8594l.m46771e(r6, r0)
            super.mo3614N1(r6)
            int r0 = p159f.p166c.p224o.C4623e.action_function
            android.view.MenuItem r1 = r6.findItem(r0)
            int r2 = p159f.p166c.p224o.C4627i.coocent_mime_type_video
            java.lang.String r2 = r5.mo3582D0(r2)
            r1.setTitle(r2)
            int r1 = p159f.p166c.p224o.C4623e.action_search
            android.view.MenuItem r1 = r6.findItem(r1)
            f.c.m.a r2 = r5.f9069m0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == 0) goto L_0x002f
            p369i.p387z.p389d.C8594l.m46769c(r2)
            boolean r2 = r2.mo15362h()
            if (r2 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r2 = 0
            goto L_0x0032
        L_0x0031:
            r2 = 1
        L_0x0032:
            r1.setVisible(r2)
            android.content.Context r1 = r5.mo3708v2()
            java.lang.String r2 = "requireContext()"
            p369i.p387z.p389d.C8594l.m46770d(r1, r2)
            int r2 = r5.mo10118v3()
            p159f.p166c.p224o.p226l.C4663m.m20171d(r6, r1, r2)
            android.view.MenuItem r6 = r6.findItem(r0)
            f.c.m.a r0 = r5.f9069m0
            if (r0 == 0) goto L_0x0056
            p369i.p387z.p389d.C8594l.m46769c(r0)
            boolean r0 = r0.mo15366l()
            if (r0 != 0) goto L_0x0057
        L_0x0056:
            r3 = 1
        L_0x0057:
            r6.setVisible(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.videolibrary.p058ui.folder.C2611l.mo3614N1(android.view.Menu):void");
    }

    /* renamed from: U1 */
    public void mo3636U1(View view, Bundle bundle) {
        C8594l.m46771e(view, "view");
        super.mo3636U1(view, bundle);
        mo3590F2(true);
        C4630b bVar = this.f9068l0;
        if (bVar != null) {
            RecyclerView recyclerView = bVar.f13361f;
            recyclerView.setHasFixedSize(true);
            Context v2 = mo3708v2();
            C8594l.m46770d(v2, "requireContext()");
            recyclerView.mo4622h(new C4714a(v2, C4621c.video_recycler_view_default_spacing));
            recyclerView.setItemAnimator(new C8370b(new OvershootInterpolator(1.0f)));
            recyclerView.setLayoutManager(new GridLayoutManager(mo3708v2(), 2, 1, false));
            Context v22 = mo3708v2();
            C8594l.m46770d(v22, "requireContext()");
            C2604k kVar = new C2604k(v22, 0, 2, (C8589g) null);
            this.f9067k0 = kVar;
            if (kVar != null) {
                recyclerView.setAdapter(kVar);
                String str = f9063u0;
                C4630b bVar2 = this.f9068l0;
                if (bVar2 != null) {
                    RecyclerView recyclerView2 = bVar2.f13361f;
                    C2604k kVar2 = this.f9067k0;
                    if (kVar2 != null) {
                        C2604k.C2607c cVar = new C2604k.C2607c(kVar2);
                        C4630b bVar3 = this.f9068l0;
                        if (bVar3 != null) {
                            RecyclerView recyclerView3 = bVar3.f13361f;
                            C8594l.m46770d(recyclerView3, "mVideoFragmentFolderBinding.rvFolder");
                            C4168j0.C4169a aVar = new C4168j0.C4169a(str, recyclerView2, cVar, new C2604k.C2606b(recyclerView3), C4177k0.m18419b());
                            aVar.mo14328b(C4165i0.m18384a());
                            C4168j0<String> a = aVar.mo14327a();
                            a.mo14291c(new C2621h(this));
                            C8457t tVar = C8457t.f34900a;
                            C8594l.m46770d(a, "Builder(\n            TAG…         })\n            }");
                            this.f9066j0 = a;
                            C2604k kVar3 = this.f9067k0;
                            if (kVar3 == null) {
                                C8594l.m46783q("mFolderAdapter");
                                throw null;
                            } else if (a != null) {
                                kVar3.mo10093q(a);
                                kVar3.mo10091o(this.f9075s0);
                                m11968e3();
                            } else {
                                C8594l.m46783q("mFolderTracker");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mVideoFragmentFolderBinding");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("mFolderAdapter");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("mVideoFragmentFolderBinding");
                    throw null;
                }
            } else {
                C8594l.m46783q("mFolderAdapter");
                throw null;
            }
        } else {
            C8594l.m46783q("mVideoFragmentFolderBinding");
            throw null;
        }
    }

    /* renamed from: W3 */
    public final void mo10117W3(int i) {
        if (mo10118v3() != i) {
            C4681i iVar = this.f9065i0;
            if (iVar != null) {
                iVar.mo15411L(i);
            } else {
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
        }
    }

    /* renamed from: e1 */
    public void mo3662e1(int i, int i2, Intent intent) {
        super.mo3662e1(i, i2, intent);
        if (i == 1114 && Build.VERSION.SDK_INT >= 30 && i2 == -1) {
            Toast.makeText(mo3708v2(), C4627i.coocent_video_delete_successfully, 0).show();
            m11957M3(this.f9073q0);
            C4815n nVar = this.f9064h0;
            if (nVar != null) {
                nVar.mo15542Q(this.f9073q0);
                m11958N3(0, this.f9073q0);
                return;
            }
            C8594l.m46783q("mVideoStoreViewModel");
            throw null;
        }
    }

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        super.mo3679l1(bundle);
        mo3584D2(new C7571b());
        mo3587E2(new C7571b());
        mo3612M2(new C7571b());
        PlayerHelper.Companion companion = PlayerHelper.Companion;
        Context applicationContext = mo3708v2().getApplicationContext();
        C8594l.m46770d(applicationContext, "requireContext().applicationContext");
        this.f9072p0 = companion.getInstance(applicationContext);
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8594l.m46771e(layoutInflater, "inflater");
        C4630b d = C4630b.m20089d(layoutInflater, viewGroup, false);
        C8594l.m46770d(d, "it");
        this.f9068l0 = d;
        FrameLayout c = d.mo7577a();
        C8594l.m46770d(c, "inflate(inflater, contai…nding = it\n        }.root");
        return c;
    }

    /* renamed from: v3 */
    public final int mo10118v3() {
        C2604k kVar = this.f9067k0;
        if (kVar != null) {
            return kVar.mo10085i();
        }
        C8594l.m46783q("mFolderAdapter");
        throw null;
    }
}
