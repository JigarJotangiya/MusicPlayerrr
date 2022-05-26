package net.coocent.android.xmlparser.gift;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.coocent.android.xmlparser.C9454k;
import net.coocent.android.xmlparser.C9482m;
import net.coocent.android.xmlparser.C9483n;
import net.coocent.android.xmlparser.C9488q;
import net.coocent.android.xmlparser.C9489r;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.loading.DoubleCircleBuilder;
import net.coocent.android.xmlparser.loading.ZLoadingDrawable;
import net.coocent.android.xmlparser.p461z.C9566f;
import p082e.p109h.p118o.C3699e;
import p159f.p166c.p213j.p214a.C4592c;
import p391j.p392a.p393a.C8613f;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;

/* renamed from: net.coocent.android.xmlparser.gift.e */
/* compiled from: GiftGameFragment */
public class C9442e extends Fragment implements C9488q {

    /* renamed from: d0 */
    private AppCompatImageView f36375d0;

    /* renamed from: e0 */
    private C9443a f36376e0;

    /* renamed from: f0 */
    private ZLoadingDrawable f36377f0;

    /* renamed from: g0 */
    private AsyncTask<String, String, ArrayList<C9483n>> f36378g0;

    /* renamed from: h0 */
    private int f36379h0;

    /* renamed from: net.coocent.android.xmlparser.gift.e$a */
    /* compiled from: GiftGameFragment */
    static class C9443a extends RecyclerView.C0797h<C9444a> {

        /* renamed from: a */
        private Context f36380a;

        /* renamed from: b */
        private List<C9483n> f36381b = new ArrayList();

        /* renamed from: c */
        private Map<String, String> f36382c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C9445b f36383d;

        /* renamed from: net.coocent.android.xmlparser.gift.e$a$a */
        /* compiled from: GiftGameFragment */
        class C9444a extends RecyclerView.C0792c0 implements View.OnClickListener {

            /* renamed from: g */
            ImageView f36384g;

            /* renamed from: h */
            ImageView f36385h;

            /* renamed from: i */
            TextView f36386i;

            C9444a(View view) {
                super(view);
                this.f36384g = (ImageView) view.findViewById(C8614g.iv_gift_icon);
                this.f36385h = (ImageView) view.findViewById(C8614g.new_icon);
                this.f36386i = (TextView) view.findViewById(C8614g.tv_gift_title);
                view.setOnClickListener(this);
            }

            public void onClick(View view) {
                if (C9443a.this.f36383d != null) {
                    int adapterPosition = getAdapterPosition();
                    C9443a.this.f36383d.mo32561a(C9443a.this.mo32570d(adapterPosition), adapterPosition);
                }
            }
        }

        /* renamed from: net.coocent.android.xmlparser.gift.e$a$b */
        /* compiled from: GiftGameFragment */
        interface C9445b {
            /* renamed from: a */
            void mo32561a(C9483n nVar, int i);
        }

        C9443a(Context context) {
            this.f36380a = context;
            this.f36382c = GiftConfig.m49721d(context);
        }

        /* renamed from: e */
        static /* synthetic */ void m49762e(WeakReference weakReference, String str, Bitmap bitmap) {
            if (bitmap != null && weakReference.get() != null) {
                ((ImageView) weakReference.get()).setImageBitmap(bitmap);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C9483n mo32570d(int i) {
            return this.f36381b.get(i);
        }

        /* renamed from: f */
        public void onBindViewHolder(C9444a aVar, int i) {
            C9483n nVar = this.f36381b.get(i);
            if (nVar != null) {
                int i2 = 8;
                if (i >= 3) {
                    aVar.f36385h.setVisibility(8);
                } else {
                    ImageView imageView = aVar.f36385h;
                    if (C9502v.m49951v(nVar.mo32695g())) {
                        i2 = 0;
                    }
                    imageView.setVisibility(i2);
                }
                GiftConfig.m49723h(aVar.f36386i, this.f36382c, nVar.mo32696h(), nVar.mo32696h());
                Bitmap h = new C9454k().mo32585h(C9502v.f36501e, nVar, new C9435a(new WeakReference(aVar.f36384g)));
                if (h == null) {
                    aVar.f36384g.setImageResource(C8613f.gift_default_icon);
                } else {
                    aVar.f36384g.setImageBitmap(h);
                }
            }
        }

        /* renamed from: g */
        public C9444a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C9444a(LayoutInflater.from(this.f36380a).inflate(C8615h.item_gift_game, viewGroup, false));
        }

        public int getItemCount() {
            return this.f36381b.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo32573h(C9445b bVar) {
            this.f36383d = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo32574i(List<C9483n> list) {
            if (list != null) {
                this.f36381b.clear();
                this.f36381b.addAll(list);
                notifyDataSetChanged();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public /* synthetic */ void mo32569Y2(SharedPreferences sharedPreferences, C9483n nVar, int i) {
        if (nVar != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String g = nVar.mo32695g();
            edit.putString(g, g).apply();
            try {
                Uri parse = Uri.parse(("market://details?id=" + g) + "&referrer=utm_source%3Dcoocent_Promotion_" + C9502v.m49941l() + "%26utm_medium%3Dclick_download");
                Intent action = mo3705u2().getPackageManager().getLaunchIntentForPackage("com.android.vending").setAction("android.intent.action.VIEW");
                action.setData(parse);
                mo3627R2(action);
                this.f36376e0.notifyItemChanged(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
            C9502v.m49917L(mo3708v2(), "gift", new C3699e("gift_with_game", g));
        }
    }

    /* renamed from: Z2 */
    static C9442e m49754Z2(int i) {
        C9442e eVar = new C9442e();
        Bundle bundle = new Bundle();
        bundle.putInt("net.coocent.android.xmlparser.gift.GiftGameFragment.TYPE", i);
        eVar.mo3581C2(bundle);
        return eVar;
    }

    /* renamed from: U1 */
    public void mo3636U1(View view, Bundle bundle) {
        super.mo3636U1(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C8614g.rv_gift_game);
        this.f36375d0 = (AppCompatImageView) view.findViewById(C8614g.iv_gift_loading);
        ZLoadingDrawable zLoadingDrawable = new ZLoadingDrawable(new DoubleCircleBuilder(mo3708v2()).setColor(Color.parseColor("#EBEBEB")));
        this.f36377f0 = zLoadingDrawable;
        this.f36375d0.setImageDrawable(zLoadingDrawable);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(mo3708v2(), 3, 1, false));
        C9443a aVar = new C9443a(mo3708v2());
        this.f36376e0 = aVar;
        recyclerView.setAdapter(aVar);
        if (C9566f.m50204o()) {
            if (this.f36379h0 == 1) {
                ArrayList<C9483n> m = C9502v.m49942m();
                if (m == null || m.isEmpty()) {
                    this.f36375d0.setVisibility(0);
                    this.f36377f0.start();
                    Application application = mo3705u2().getApplication();
                    String path = mo3708v2().getFilesDir().getPath();
                    C9482m mVar = new C9482m(application, path, mo3708v2().getFilesDir() + "/icon/", "/game.xml", 1, this);
                    this.f36378g0 = mVar;
                    mVar.execute(new String[]{C9502v.f36497a + "V3" + "/GameAndroid.xml"});
                } else {
                    this.f36376e0.mo32574i(m);
                }
            } else {
                ArrayList<C9483n> a = C9502v.m49930a();
                if (a == null || a.isEmpty()) {
                    this.f36375d0.setVisibility(0);
                    this.f36377f0.start();
                    C9489r rVar = new C9489r(mo3705u2().getApplication(), C9502v.f36501e, this, (C4592c) null);
                    this.f36378g0 = rVar;
                    rVar.execute(new String[]{C9502v.f36497a + C9502v.f36500d});
                } else {
                    this.f36376e0.mo32574i(a);
                }
            }
        }
        this.f36376e0.mo32573h(new C9436b(this, PreferenceManager.getDefaultSharedPreferences(mo3708v2())));
    }

    /* renamed from: f0 */
    public boolean mo26665f0(ArrayList<C9483n> arrayList) {
        this.f36375d0.setVisibility(8);
        this.f36377f0.stop();
        this.f36376e0.mo32574i(arrayList);
        return true;
    }

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        super.mo3679l1(bundle);
        if (mo3638V() != null) {
            this.f36379h0 = mo3638V().getInt("net.coocent.android.xmlparser.gift.GiftGameFragment.TYPE", 1);
        }
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(mo3708v2()).inflate(C8615h.fragment_gift_game, viewGroup, false);
    }

    /* renamed from: v1 */
    public void mo3707v1() {
        super.mo3707v1();
        if (this.f36377f0.isRunning()) {
            this.f36377f0.stop();
        }
        AsyncTask<String, String, ArrayList<C9483n>> asyncTask = this.f36378g0;
        if (asyncTask != null && !asyncTask.isCancelled()) {
            this.f36378g0.cancel(true);
        }
    }
}
