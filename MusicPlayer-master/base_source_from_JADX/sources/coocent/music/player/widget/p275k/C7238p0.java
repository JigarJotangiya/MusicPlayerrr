package coocent.music.player.widget.p275k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C0885l;
import androidx.recyclerview.widget.C0916y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.callback.ItemDragAndSwipeCallback;
import com.chad.library.adapter.base.listener.OnItemDragListener;
import com.chad.library.adapter.base.listener.OnItemSwipeListener;
import com.coocent.music.base.data.entity.Music;
import com.makeramen.roundedimageview.RoundedImageView;
import coocent.music.player.adapter.NowPlayListAdapter;
import coocent.music.player.base.BaseApplication;
import coocent.musiclibrary.music.p284e.C7332e;
import coocent.musiclibrary.music.p292j.C7393h;
import java.util.ArrayList;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.p461z.C9566f;
import p342g.p343a.p344a.p346c.C7956i;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: coocent.music.player.widget.k.p0 */
/* compiled from: PopuPlayList */
public class C7238p0 extends C7217j0 {

    /* renamed from: E */
    public static int f31962E = 0;

    /* renamed from: F */
    public static int f31963F = 1;

    /* renamed from: G */
    public static int f31964G = 2;

    /* renamed from: A */
    private ImageView f31965A;

    /* renamed from: B */
    OnItemSwipeListener f31966B = new C7239a();

    /* renamed from: C */
    OnItemDragListener f31967C = new C7241c();

    /* renamed from: D */
    private BaseQuickAdapter.OnItemChildClickListener f31968D = new C7256u(this);

    /* renamed from: k */
    private boolean f31969k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Context f31970l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public RecyclerView f31971m;

    /* renamed from: n */
    private NowPlayListAdapter f31972n;

    /* renamed from: o */
    private View f31973o;

    /* renamed from: p */
    private List<Music> f31974p;

    /* renamed from: q */
    private RoundedImageView f31975q;

    /* renamed from: r */
    private TextView f31976r;

    /* renamed from: s */
    private ImageView f31977s;

    /* renamed from: t */
    private C0885l f31978t;

    /* renamed from: u */
    private ItemDragAndSwipeCallback f31979u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C7956i f31980v;

    /* renamed from: w */
    private int f31981w = f31962E;

    /* renamed from: x */
    private View f31982x;

    /* renamed from: y */
    private ImageView f31983y;

    /* renamed from: z */
    private TextView f31984z;

    /* renamed from: coocent.music.player.widget.k.p0$a */
    /* compiled from: PopuPlayList */
    class C7239a implements OnItemSwipeListener {
        C7239a() {
        }

        public void clearView(RecyclerView.C0792c0 c0Var, int i) {
        }

        public void onItemSwipeMoving(Canvas canvas, RecyclerView.C0792c0 c0Var, float f, float f2, boolean z) {
        }

        public void onItemSwipeStart(RecyclerView.C0792c0 c0Var, int i) {
        }

        public void onItemSwiped(RecyclerView.C0792c0 c0Var, int i) {
            C7238p0.this.mo27801I(i);
        }
    }

    /* renamed from: coocent.music.player.widget.k.p0$b */
    /* compiled from: PopuPlayList */
    class C7240b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ long f31986g;

        /* renamed from: h */
        final /* synthetic */ long f31987h;

        C7240b(long j, long j2) {
            this.f31986g = j;
            this.f31987h = j2;
        }

        public void run() {
            C8287e.m45838f0(this.f31986g);
            if (C8287e.m45792L() == 5 && C8287e.m45873v().mo9215k() == this.f31987h) {
                C8287e.m45832d0();
            }
            C7238p0.this.mo27799G();
            C7238p0.this.f31980v.mo26502E0(false);
        }
    }

    /* renamed from: coocent.music.player.widget.k.p0$c */
    /* compiled from: PopuPlayList */
    class C7241c implements OnItemDragListener {
        C7241c() {
        }

        public void onItemDragEnd(RecyclerView.C0792c0 c0Var, int i) {
            C7238p0.this.m41068x();
        }

        public void onItemDragMoving(RecyclerView.C0792c0 c0Var, int i, RecyclerView.C0792c0 c0Var2, int i2) {
            ((C0916y) C7238p0.this.f31971m.getItemAnimator()).mo5428V(true);
        }

        public void onItemDragStart(RecyclerView.C0792c0 c0Var, int i) {
        }
    }

    /* renamed from: coocent.music.player.widget.k.p0$d */
    /* compiled from: PopuPlayList */
    class C7242d implements Runnable {

        /* renamed from: g */
        final /* synthetic */ BaseQuickAdapter f31990g;

        C7242d(BaseQuickAdapter baseQuickAdapter) {
            this.f31990g = baseQuickAdapter;
        }

        public void run() {
            if (C7238p0.this.f31970l != null) {
                this.f31990g.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: coocent.music.player.widget.k.p0$e */
    /* compiled from: PopuPlayList */
    class C7243e implements C7332e.C7334b {

        /* renamed from: a */
        final /* synthetic */ C7332e f31992a;

        C7243e(C7332e eVar) {
            this.f31992a = eVar;
        }

        /* renamed from: a */
        public void mo26720a() {
            this.f31992a.dismiss();
        }

        /* renamed from: b */
        public void mo26721b() {
            C7238p0.this.m41066u(this.f31992a);
        }

        /* renamed from: c */
        public void mo26722c() {
        }
    }

    public C7238p0(Context context, boolean z, int i) {
        super(context);
        this.f31969k = z;
        this.f31974p = new ArrayList();
        this.f31970l = context;
        this.f31981w = i;
        m41069z();
        m41057N();
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void mo27796B(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (view.getId() == R.id.moreBtn) {
            mo27801I(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void mo27797D(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        C8287e.m45858n0(true);
        C8287e.m45823a0(i, this.f31974p);
        mo27802J();
        new Handler().postDelayed(new C7242d(baseQuickAdapter), 500);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void mo27798F(View view) {
        switch (view.getId()) {
            case R.id.empty_list:
                m41067v();
                return;
            case R.id.iv_add_to_playlist:
                m41065r();
                return;
            case R.id.iv_play_mode:
                Context context = this.f31970l;
                ImageView imageView = this.f31965A;
                int i = this.f31981w;
                C8287e.m45783G0(context, imageView, (i == f31963F || i == f31964G) ? false : true);
                return;
            case R.id.tv_cancel:
                dismiss();
                return;
            default:
                return;
        }
    }

    /* renamed from: N */
    private void m41057N() {
        C7257v vVar = new C7257v(this);
        C7258w wVar = new C7258w(this);
        this.f31972n.setOnItemClickListener(vVar);
        this.f31977s.setOnClickListener(wVar);
        this.f31983y.setOnClickListener(wVar);
        this.f31984z.setOnClickListener(wVar);
        this.f31965A.setOnClickListener(wVar);
        this.f31972n.setOnItemChildClickListener(this.f31968D);
    }

    /* renamed from: O */
    private void m41058O() {
        int i;
        if (C8287e.m45873v() != null) {
            long k = C8287e.m45873v().mo9215k();
            List<Music> s = C8287e.m45867s();
            i = 0;
            while (true) {
                if (i < s.size()) {
                    if (s.get(i) != null && s.get(i).mo9215k() == k) {
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            mo27807l((LinearLayoutManager) this.f31971m.getLayoutManager(), i, false);
        }
        i = 0;
        mo27807l((LinearLayoutManager) this.f31971m.getLayoutManager(), i, false);
    }

    /* renamed from: Q */
    private void m41059Q() {
        setWidth(C8345u.m46331l());
        setHeight((C9566f.f36726b * 2) / 3);
        setContentView(this.f31973o);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable(this.f31970l.getResources().getColor(R.color.transparent)));
        setAnimationStyle(R.style.nowplaylist);
    }

    /* renamed from: r */
    private void m41065r() {
        try {
            C8287e.m45828c((FragmentActivity) this.f31970l, this.f31974p, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    /* renamed from: u */
    public void m41066u(C7332e eVar) {
        List<Music> list = this.f31974p;
        if (list != null) {
            list.clear();
        }
        TextView textView = this.f31976r;
        textView.setText(C8345u.m46333n(R.string.playlist_text) + " (" + 0 + ")");
        this.f31972n.notifyDataSetChanged();
        if (eVar != null) {
            eVar.dismiss();
        }
        this.f31889h.mo26513e0();
        dismiss();
    }

    /* renamed from: v */
    private void m41067v() {
        C7332e eVar = new C7332e(this.f31970l, C8345u.m46333n(R.string.tip), C8345u.m46333n(R.string.clean_playlist_tip), C8343s.m46300h(), C8345u.m46326g(R.color.color_bbb), C8345u.m46326g(R.color.white), false);
        eVar.requestWindowFeature(1);
        eVar.show();
        eVar.mo28071c(new C7243e(eVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m41068x() {
        int i;
        try {
            if (this.f31974p != null) {
                int i2 = -1;
                int L = C8287e.m45792L();
                if (L != 5) {
                    List<Music> list = this.f31974p;
                    if (list != null && list.size() > 0) {
                        for (int i3 = 0; i3 < this.f31974p.size(); i3++) {
                            if (C8287e.m45873v().mo9215k() == this.f31974p.get(i3).mo9215k()) {
                                i2 = i3;
                            }
                        }
                    }
                } else {
                    List<Music> t = C8287e.m45869t();
                    if (t != null && t.size() > 0) {
                        for (int i4 = 0; i4 < t.size(); i4++) {
                            if (C8287e.m45873v().mo9215k() == t.get(i4).mo9215k()) {
                                i2 = i4;
                            }
                        }
                    }
                }
                if (i2 >= 0) {
                    if (L != 5) {
                        C8287e.m45840g(i2, this.f31974p);
                    } else if (C8287e.m45869t() != null) {
                        C8287e.m45882z0(C8287e.m45778E(this.f31974p));
                        List<Music> list2 = this.f31974p;
                        if (list2 == null || list2.size() <= 0) {
                            i = i2;
                        } else {
                            i = i2;
                            for (int i5 = 0; i5 < this.f31974p.size(); i5++) {
                                if (C8287e.m45873v().mo9215k() == this.f31974p.get(i5).mo9215k()) {
                                    i = i5;
                                }
                            }
                        }
                        C8287e.m45840g(i, this.f31974p);
                        C8287e.m45864q0(C8287e.m45869t().get(i2));
                    }
                    this.f31980v.mo26511a1();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: z */
    private void m41069z() {
        this.f31973o = LayoutInflater.from(this.f31970l).inflate(R.layout.now_playing_list, (ViewGroup) null);
        m41059Q();
        RoundedImageView roundedImageView = (RoundedImageView) this.f31973o.findViewById(R.id.iv_play_backgroud);
        this.f31975q = roundedImageView;
        roundedImageView.setCornerRadius((float) C8345u.m46323d(20));
        RecyclerView recyclerView = (RecyclerView) this.f31973o.findViewById(R.id.recyclerview);
        this.f31971m = recyclerView;
        ((C0916y) recyclerView.getItemAnimator()).mo5428V(false);
        this.f31971m.setLayoutManager(new LinearLayoutManager(this.f31970l));
        this.f31976r = (TextView) this.f31973o.findViewById(R.id.playlist_title);
        this.f31984z = (TextView) this.f31973o.findViewById(R.id.tv_cancel);
        View findViewById = this.f31973o.findViewById(R.id.line1);
        View findViewById2 = this.f31973o.findViewById(R.id.line2);
        this.f31965A = (ImageView) this.f31973o.findViewById(R.id.iv_play_mode);
        int h = C7393h.m41695f(this.f31970l).mo28186h();
        ImageView imageView = this.f31965A;
        int i = this.f31981w;
        C8287e.m45781F0(h, imageView, 2, (i == f31963F || i == f31964G) ? false : true);
        int i2 = this.f31981w;
        int i3 = f31964G;
        int i4 = R.color.popup_line;
        findViewById.setBackgroundColor(C8343s.m46295c((i2 == i3 || i2 == f31963F) ? R.color.popup_line_skin2 : R.color.popup_line));
        int i5 = this.f31981w;
        if (i5 == f31964G || i5 == f31963F) {
            i4 = R.color.popup_line_skin2;
        }
        findViewById2.setBackgroundColor(C8343s.m46295c(i4));
        TextView textView = this.f31984z;
        int i6 = this.f31981w;
        int i7 = f31964G;
        int i8 = R.color.default_text_color;
        textView.setTextColor(C8343s.m46295c((i6 == i7 || i6 == f31963F) ? R.color.white : R.color.default_text_color));
        TextView textView2 = this.f31976r;
        int i9 = this.f31981w;
        textView2.setTextColor(C8343s.m46295c((i9 == f31964G || i9 == f31963F) ? R.color.white : R.color.default_text_color));
        this.f31982x = this.f31973o.findViewById(R.id.cover_view);
        this.f31977s = (ImageView) this.f31973o.findViewById(R.id.empty_list);
        this.f31983y = (ImageView) this.f31973o.findViewById(R.id.iv_add_to_playlist);
        ImageView imageView2 = this.f31977s;
        int i10 = this.f31981w;
        imageView2.setImageDrawable(C8343s.m46304l(R.drawable.ic_playlist05_clear_list, (i10 == f31964G || i10 == f31963F) ? R.color.white : R.color.default_text_color));
        ImageView imageView3 = this.f31983y;
        int i11 = this.f31981w;
        if (i11 == f31964G || i11 == f31963F) {
            i8 = R.color.white;
        }
        imageView3.setImageDrawable(C8343s.m46304l(R.drawable.ic_playlist04_add_queue, i8));
        int i12 = 8;
        this.f31977s.setVisibility(this.f31981w == f31963F ? 8 : 0);
        this.f31983y.setVisibility(this.f31981w == f31963F ? 8 : 0);
        int i13 = this.f31981w;
        if (i13 == f31964G || i13 == f31963F) {
            this.f31982x.setVisibility(0);
        } else {
            View view = this.f31982x;
            if (C8343s.f34787b) {
                i12 = 0;
            }
            view.setVisibility(i12);
        }
        NowPlayListAdapter nowPlayListAdapter = new NowPlayListAdapter(R.layout.item_popu_nowplaying, this.f31974p, this.f31981w);
        this.f31972n = nowPlayListAdapter;
        nowPlayListAdapter.setHasStableIds(false);
        this.f31971m.setAdapter(this.f31972n);
        if (this.f31981w != f31963F) {
            ItemDragAndSwipeCallback itemDragAndSwipeCallback = new ItemDragAndSwipeCallback(this.f31972n);
            this.f31979u = itemDragAndSwipeCallback;
            C0885l lVar = new C0885l(itemDragAndSwipeCallback);
            this.f31978t = lVar;
            lVar.mo5310j(this.f31971m);
            this.f31979u.setSwipeMoveFlags(48);
            this.f31972n.enableSwipeItem();
            this.f31972n.setOnItemSwipeListener(this.f31966B);
            this.f31972n.enableDragItem(this.f31978t, R.id.drag, false);
        }
        this.f31972n.setOnItemDragListener(this.f31967C);
        C8343s.m46311s(this.f31975q, true);
    }

    /* renamed from: G */
    public void mo27799G() {
        mo27805M();
        mo27802J();
        this.f31972n.notifyDataSetChanged();
        mo27804L();
    }

    /* renamed from: H */
    public void mo27800H() {
    }

    /* renamed from: I */
    public void mo27801I(int i) {
        try {
            if (this.f31974p.size() == 1) {
                m41066u((C7332e) null);
                return;
            }
            if (C8287e.m45873v().mo9215k() == C8287e.m45867s().get(i).mo9215k() && i == C8287e.m45867s().size() - 1) {
                C8287e.m45866r0(true);
            }
            long k = C8287e.m45867s().get(i).mo9215k();
            if (C8287e.m45792L() != 5 && C8287e.m45873v().mo9215k() == k) {
                C8287e.m45832d0();
            }
            new Handler().postDelayed(new C7240b(this.f31974p.get(i).mo9215k(), k), 500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: J */
    public void mo27802J() {
        boolean z = false;
        int size = C8287e.m45867s() == null ? 0 : C8287e.m45867s().size();
        TextView textView = this.f31976r;
        textView.setText(C8345u.m46333n(R.string.playlist_text) + " (" + size + ")");
        int h = C7393h.m41695f(this.f31970l).mo28186h();
        ImageView imageView = this.f31965A;
        int i = this.f31981w;
        if (!(i == f31963F || i == f31964G)) {
            z = true;
        }
        C8287e.m45781F0(h, imageView, 2, z);
    }

    /* renamed from: K */
    public void mo27803K(boolean z) {
        ImageView imageView = this.f31983y;
        if (imageView != null) {
            imageView.setVisibility(z ? 8 : 0);
        }
    }

    /* renamed from: L */
    public void mo27804L() {
        int i = this.f31981w;
        if (i != f31964G && i != f31963F) {
            C8343s.m46311s(this.f31975q, true);
        } else if (this.f31975q != null) {
            if (C8287e.m45873v() != null) {
                C8321j.m45999e(C8314f.m45973b(C8345u.m46327h(), 0, C8287e.m45873v().mo9215k(), C8287e.m45859o()), R.drawable.home_intermediate1_speaker04_01, this.f31975q, 50, 10);
            } else {
                C8321j.m45999e(BuildConfig.FLAVOR, R.drawable.home_intermediate1_speaker04_01, this.f31975q, 50, 10);
            }
            this.f31975q.setAlpha(C8337n.m46065k0(C8345u.m46327h()).mo30275y());
        }
    }

    /* renamed from: M */
    public void mo27805M() {
        if (C8287e.m45867s() != null) {
            ArrayList arrayList = new ArrayList(C8287e.m45867s());
            List<Music> list = this.f31974p;
            if (list != null) {
                list.clear();
            } else {
                this.f31974p = new ArrayList();
            }
            this.f31974p.addAll(arrayList);
        }
    }

    /* renamed from: P */
    public void mo27806P(C7956i iVar) {
        this.f31980v = iVar;
    }

    /* renamed from: k */
    public void mo27743k(View view) {
        super.mo27743k(view);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (this.f31969k && BaseApplication.f31159w && BaseApplication.f31158v) {
            setSoftInputMode(32);
        }
        showAtLocation(view, 80, 100, -iArr[1]);
        setOnDismissListener(this.f31891j);
        mo27802J();
        NowPlayListAdapter nowPlayListAdapter = this.f31972n;
        if (nowPlayListAdapter != null) {
            nowPlayListAdapter.notifyDataSetChanged();
        }
        m41058O();
    }

    /* renamed from: l */
    public void mo27807l(LinearLayoutManager linearLayoutManager, int i, boolean z) {
        linearLayoutManager.mo4470A2(i, 0);
        linearLayoutManager.mo4426D2(z);
    }

    /* renamed from: s */
    public void mo27808s(int i) {
        ImageView imageView = this.f31965A;
        if (imageView != null) {
            int i2 = this.f31981w;
            C8287e.m45781F0(i, imageView, 2, (i2 == f31963F || i2 == f31964G) ? false : true);
        }
    }

    /* renamed from: t */
    public void mo27809t() {
        this.f31981w = 0;
        mo27804L();
    }

    /* renamed from: w */
    public void mo27810w() {
        RoundedImageView roundedImageView = this.f31975q;
        if (roundedImageView != null) {
            roundedImageView.setBackground((Drawable) null);
            this.f31975q.setImageBitmap((Bitmap) null);
            this.f31975q.setImageDrawable((Drawable) null);
            this.f31975q.setBackgroundDrawable((Drawable) null);
            this.f31975q = null;
        }
        if (this.f31971m != null) {
            this.f31971m = null;
        }
        if (this.f31972n != null) {
            this.f31972n = null;
        }
        if (this.f31973o != null) {
            this.f31973o = null;
        }
    }

    /* renamed from: y */
    public List<Music> mo27811y() {
        return this.f31974p;
    }
}
