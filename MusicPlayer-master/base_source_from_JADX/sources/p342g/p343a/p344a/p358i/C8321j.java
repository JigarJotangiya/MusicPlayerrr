package p342g.p343a.p344a.p358i;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.C1738j;
import com.bumptech.glide.load.p030n.C1873j;
import com.bumptech.glide.p047q.C2153h;
import com.bumptech.glide.p047q.p048l.C2160c;
import com.bumptech.glide.p047q.p048l.C2164g;
import com.bumptech.glide.p047q.p049m.C2172b;
import com.bumptech.glide.p050r.C2178d;
import coocent.music.player.widget.C7190g;
import media.musicplayer.audioplayer.videoplayer.R;
import p082e.p144r.p145a.C4123b;
import p342g.p343a.p344a.p346c.C7950c;
import p342g.p343a.p344a.p346c.C7967t;
import p360h.p361a.p362a.p363a.C8356b;

/* renamed from: g.a.a.i.j */
/* compiled from: ImageUtils */
public class C8321j {

    /* renamed from: g.a.a.i.j$a */
    /* compiled from: ImageUtils */
    class C8322a extends C2160c<Drawable> {

        /* renamed from: j */
        final /* synthetic */ ImageView f34747j;

        C8322a(ImageView imageView) {
            this.f34747j = imageView;
        }

        /* renamed from: d */
        public void mo8222c(Drawable drawable, C2172b<? super Drawable> bVar) {
            this.f34747j.setBackground(drawable);
            C8337n.m46065k0(C8345u.m46327h()).mo30081B2(C8337n.m46065k0(C8345u.m46327h()).mo30099G0() + 1);
        }

        /* renamed from: f */
        public void mo8430f(Drawable drawable) {
            super.mo8430f(drawable);
        }

        /* renamed from: k */
        public void mo8225k(Drawable drawable) {
        }
    }

    /* renamed from: g.a.a.i.j$b */
    /* compiled from: ImageUtils */
    class C8323b extends C2160c<Drawable> {

        /* renamed from: j */
        final /* synthetic */ ImageView f34748j;

        C8323b(ImageView imageView) {
            this.f34748j = imageView;
        }

        /* renamed from: d */
        public void mo8222c(Drawable drawable, C2172b<? super Drawable> bVar) {
            this.f34748j.setImageDrawable(drawable);
        }

        /* renamed from: f */
        public void mo8430f(Drawable drawable) {
            super.mo8430f(drawable);
        }

        /* renamed from: k */
        public void mo8225k(Drawable drawable) {
        }
    }

    /* renamed from: g.a.a.i.j$c */
    /* compiled from: ImageUtils */
    class C8324c extends C2164g<Drawable> {

        /* renamed from: j */
        final /* synthetic */ ImageView f34749j;

        /* renamed from: k */
        final /* synthetic */ int f34750k;

        /* renamed from: l */
        final /* synthetic */ int f34751l;

        /* renamed from: m */
        final /* synthetic */ int f34752m;

        C8324c(ImageView imageView, int i, int i2, int i3) {
            this.f34749j = imageView;
            this.f34750k = i;
            this.f34751l = i2;
            this.f34752m = i3;
        }

        /* renamed from: d */
        public void mo8222c(Drawable drawable, C2172b<? super Drawable> bVar) {
            this.f34749j.setImageDrawable(drawable);
        }

        /* renamed from: f */
        public void mo8430f(Drawable drawable) {
            super.mo8430f(drawable);
            try {
                C1719b.m8597t(C8345u.m46327h()).mo7662s(Integer.valueOf(this.f34752m)).mo7637a((C2153h) new C2153h().mo8392j0(new C8356b(this.f34750k, this.f34751l))).mo7645z0(this.f34749j);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g.a.a.i.j$d */
    /* compiled from: ImageUtils */
    class C8325d extends C2164g<Drawable> {

        /* renamed from: j */
        final /* synthetic */ ImageView f34753j;

        /* renamed from: k */
        final /* synthetic */ C7950c f34754k;

        /* renamed from: l */
        final /* synthetic */ Drawable f34755l;

        C8325d(ImageView imageView, C7950c cVar, Drawable drawable) {
            this.f34753j = imageView;
            this.f34754k = cVar;
            this.f34755l = drawable;
        }

        /* renamed from: d */
        public void mo8222c(Drawable drawable, C2172b<? super Drawable> bVar) {
            try {
                this.f34753j.setImageDrawable(drawable);
                C7950c cVar = this.f34754k;
                if (cVar != null) {
                    cVar.mo29480a(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: f */
        public void mo8430f(Drawable drawable) {
            super.mo8430f(drawable);
            try {
                this.f34753j.setImageDrawable(this.f34755l);
                C7950c cVar = this.f34754k;
                if (cVar != null) {
                    cVar.mo29480a(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g.a.a.i.j$e */
    /* compiled from: ImageUtils */
    class C8326e extends C2164g<Drawable> {

        /* renamed from: j */
        final /* synthetic */ ImageView f34756j;

        C8326e(ImageView imageView) {
            this.f34756j = imageView;
        }

        /* renamed from: d */
        public void mo8222c(Drawable drawable, C2172b<? super Drawable> bVar) {
            this.f34756j.setImageDrawable(drawable);
        }

        /* renamed from: f */
        public void mo8430f(Drawable drawable) {
            super.mo8430f(drawable);
        }
    }

    /* renamed from: g.a.a.i.j$f */
    /* compiled from: ImageUtils */
    class C8327f extends C2164g<Drawable> {

        /* renamed from: j */
        final /* synthetic */ ImageView f34757j;

        /* renamed from: k */
        final /* synthetic */ int f34758k;

        C8327f(ImageView imageView, int i) {
            this.f34757j = imageView;
            this.f34758k = i;
        }

        /* renamed from: d */
        public void mo8222c(Drawable drawable, C2172b<? super Drawable> bVar) {
            this.f34757j.setImageDrawable(drawable);
        }

        /* renamed from: f */
        public void mo8430f(Drawable drawable) {
            super.mo8430f(drawable);
            this.f34757j.setImageDrawable(new ColorDrawable(C8345u.m46326g(this.f34758k)));
        }
    }

    /* renamed from: g.a.a.i.j$g */
    /* compiled from: ImageUtils */
    class C8328g extends C2164g<Drawable> {

        /* renamed from: j */
        final /* synthetic */ ImageView f34759j;

        /* renamed from: k */
        final /* synthetic */ int f34760k;

        C8328g(ImageView imageView, int i) {
            this.f34759j = imageView;
            this.f34760k = i;
        }

        /* renamed from: d */
        public void mo8222c(Drawable drawable, C2172b<? super Drawable> bVar) {
            this.f34759j.setImageDrawable(drawable);
        }

        /* renamed from: f */
        public void mo8430f(Drawable drawable) {
            super.mo8430f(drawable);
            ImageView imageView = this.f34759j;
            if (imageView != null) {
                imageView.setImageResource(this.f34760k);
            }
        }

        /* renamed from: i */
        public void mo8433i(Drawable drawable) {
            super.mo8433i(drawable);
            ImageView imageView = this.f34759j;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: g.a.a.i.j$h */
    /* compiled from: ImageUtils */
    class C8329h extends C2164g<Drawable> {

        /* renamed from: j */
        final /* synthetic */ ImageView f34761j;

        /* renamed from: k */
        final /* synthetic */ C7967t f34762k;

        C8329h(ImageView imageView, C7967t tVar) {
            this.f34761j = imageView;
            this.f34762k = tVar;
        }

        /* renamed from: d */
        static /* synthetic */ void m46035d(C7967t tVar, C4123b bVar) {
            if (bVar != null) {
                C4123b.C4129e f = bVar.mo14222f();
                if (f != null) {
                    tVar.mo26848a(true, f.mo14235e());
                } else {
                    tVar.mo26848a(false, C8343s.m46295c(R.color.bottom_play_bar_light));
                }
            } else {
                tVar.mo26848a(false, C8343s.m46295c(R.color.bottom_play_bar_light));
            }
        }

        /* renamed from: f */
        public void mo8430f(Drawable drawable) {
            super.mo8430f(drawable);
            this.f34761j.setImageDrawable(drawable);
            this.f34762k.mo26848a(false, C8343s.m46295c(R.color.bottom_play_bar_light));
        }

        /* renamed from: h */
        public void mo8222c(Drawable drawable, C2172b<? super Drawable> bVar) {
            this.f34761j.setImageDrawable(drawable);
            C4123b.m18234b(((BitmapDrawable) drawable).getBitmap()).mo14225a(new C8309a(this.f34762k));
        }
    }

    /* renamed from: g.a.a.i.j$i */
    /* compiled from: ImageUtils */
    class C8330i extends C2164g<Drawable> {

        /* renamed from: j */
        final /* synthetic */ ImageView f34763j;

        /* renamed from: k */
        final /* synthetic */ boolean f34764k;

        /* renamed from: l */
        final /* synthetic */ int f34765l;

        C8330i(ImageView imageView, boolean z, int i) {
            this.f34763j = imageView;
            this.f34764k = z;
            this.f34765l = i;
        }

        /* renamed from: d */
        public void mo8222c(Drawable drawable, C2172b<? super Drawable> bVar) {
            this.f34763j.setImageDrawable(drawable);
        }

        /* renamed from: f */
        public void mo8430f(Drawable drawable) {
            super.mo8430f(drawable);
            this.f34763j.setImageDrawable(C8343s.m46298f(this.f34765l));
        }

        /* renamed from: i */
        public void mo8433i(Drawable drawable) {
            super.mo8433i(drawable);
            if (this.f34764k) {
                this.f34763j.setImageDrawable(C8343s.m46298f(this.f34765l));
            }
        }
    }

    /* renamed from: g.a.a.i.j$j */
    /* compiled from: ImageUtils */
    class C8331j extends C2164g<Drawable> {

        /* renamed from: j */
        final /* synthetic */ ImageView f34766j;

        C8331j(ImageView imageView) {
            this.f34766j = imageView;
        }

        /* renamed from: d */
        public void mo8222c(Drawable drawable, C2172b<? super Drawable> bVar) {
            this.f34766j.setImageDrawable(drawable);
        }

        /* renamed from: f */
        public void mo8430f(Drawable drawable) {
            super.mo8430f(drawable);
            this.f34766j.setImageDrawable(drawable);
        }
    }

    /* renamed from: g.a.a.i.j$k */
    /* compiled from: ImageUtils */
    class C8332k extends C2160c<Drawable> {

        /* renamed from: j */
        final /* synthetic */ ImageView f34767j;

        C8332k(ImageView imageView) {
            this.f34767j = imageView;
        }

        /* renamed from: d */
        public void mo8222c(Drawable drawable, C2172b<? super Drawable> bVar) {
            this.f34767j.setImageDrawable(drawable);
            C8337n.m46065k0(C8345u.m46327h()).mo30081B2(C8337n.m46065k0(C8345u.m46327h()).mo30099G0() + 1);
        }

        /* renamed from: f */
        public void mo8430f(Drawable drawable) {
            super.mo8430f(drawable);
        }

        /* renamed from: k */
        public void mo8225k(Drawable drawable) {
        }
    }

    /* renamed from: a */
    public static void m45995a(View view) {
        if (view != null) {
            try {
                if (view instanceof ImageView) {
                    ((ImageView) view).setImageDrawable((Drawable) null);
                    view.setBackground((Drawable) null);
                    ((ImageView) view).setImageBitmap((Bitmap) null);
                    ((ImageView) view).setImageDrawable((Drawable) null);
                    view.setBackgroundDrawable((Drawable) null);
                } else if (view instanceof ViewGroup) {
                    ((ViewGroup) view).removeAllViews();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (r2 != false) goto L_0x002d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45996b(java.lang.String r3, int r4, android.widget.ImageView r5) {
        /*
            com.bumptech.glide.q.h r0 = new com.bumptech.glide.q.h
            r0.<init>()
            com.bumptech.glide.q.a r0 = r0.mo8386h()
            com.bumptech.glide.q.h r0 = (com.bumptech.glide.p047q.C2153h) r0
            com.bumptech.glide.q.a r0 = r0.mo8375Z(r4)
            com.bumptech.glide.q.h r0 = (com.bumptech.glide.p047q.C2153h) r0
            com.bumptech.glide.q.a r0 = r0.mo8386h()
            com.bumptech.glide.q.h r0 = (com.bumptech.glide.p047q.C2153h) r0
            com.bumptech.glide.q.a r0 = r0.mo8391j(r4)
            com.bumptech.glide.q.h r0 = (com.bumptech.glide.p047q.C2153h) r0
            android.content.Context r1 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            com.bumptech.glide.k r1 = com.bumptech.glide.C1719b.m8597t(r1)
            if (r3 == 0) goto L_0x002d
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x0031
        L_0x002d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
        L_0x0031:
            com.bumptech.glide.j r3 = r1.mo7663t(r3)
            com.bumptech.glide.j r3 = r3.mo7637a(r0)
            g.a.a.i.j$e r4 = new g.a.a.i.j$e
            r4.<init>(r5)
            r3.mo7643w0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342g.p343a.p344a.p358i.C8321j.m45996b(java.lang.String, int, android.widget.ImageView):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45997c(java.lang.String r1, android.graphics.drawable.Drawable r2, android.widget.ImageView r3, int r4, int r5, p342g.p343a.p344a.p346c.C7950c r6) {
        /*
            java.lang.String r0 = "http"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0020
            com.bumptech.glide.q.h r4 = new com.bumptech.glide.q.h
            r4.<init>()
            com.bumptech.glide.q.a r4 = r4.mo8376a0(r2)
            com.bumptech.glide.q.h r4 = (com.bumptech.glide.p047q.C2153h) r4
            com.bumptech.glide.q.a r4 = r4.mo8386h()
            com.bumptech.glide.q.h r4 = (com.bumptech.glide.p047q.C2153h) r4
            com.bumptech.glide.q.a r4 = r4.mo8393k(r2)
            com.bumptech.glide.q.h r4 = (com.bumptech.glide.p047q.C2153h) r4
            goto L_0x003d
        L_0x0020:
            com.bumptech.glide.q.h r0 = new com.bumptech.glide.q.h
            r0.<init>()
            com.bumptech.glide.q.a r0 = r0.mo8376a0(r2)
            com.bumptech.glide.q.h r0 = (com.bumptech.glide.p047q.C2153h) r0
            com.bumptech.glide.q.a r0 = r0.mo8386h()
            com.bumptech.glide.q.h r0 = (com.bumptech.glide.p047q.C2153h) r0
            com.bumptech.glide.q.a r4 = r0.mo8374X(r4, r5)
            com.bumptech.glide.q.h r4 = (com.bumptech.glide.p047q.C2153h) r4
            com.bumptech.glide.q.a r4 = r4.mo8393k(r2)
            com.bumptech.glide.q.h r4 = (com.bumptech.glide.p047q.C2153h) r4
        L_0x003d:
            android.content.Context r5 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            com.bumptech.glide.k r5 = com.bumptech.glide.C1719b.m8597t(r5)
            if (r1 == 0) goto L_0x004d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x004e
        L_0x004d:
            r1 = r2
        L_0x004e:
            com.bumptech.glide.j r1 = r5.mo7663t(r1)
            com.bumptech.glide.j r1 = r1.mo7637a(r4)
            g.a.a.i.j$d r4 = new g.a.a.i.j$d
            r4.<init>(r3, r6, r2)
            r1.mo7643w0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342g.p343a.p344a.p358i.C8321j.m45997c(java.lang.String, android.graphics.drawable.Drawable, android.widget.ImageView, int, int, g.a.a.c.c):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r1 != false) goto L_0x0017;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45998d(android.content.Context r2, java.lang.String r3, int r4, android.widget.ImageView r5) {
        /*
            com.bumptech.glide.q.h r0 = new com.bumptech.glide.q.h
            r0.<init>()
            com.bumptech.glide.q.a r0 = r0.mo8386h()
            com.bumptech.glide.q.h r0 = (com.bumptech.glide.p047q.C2153h) r0
            com.bumptech.glide.k r2 = com.bumptech.glide.C1719b.m8597t(r2)
            if (r3 == 0) goto L_0x0017
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x001b
        L_0x0017:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
        L_0x001b:
            com.bumptech.glide.j r2 = r2.mo7663t(r3)
            com.bumptech.glide.q.a r2 = r2.mo8375Z(r4)
            com.bumptech.glide.j r2 = (com.bumptech.glide.C1738j) r2
            com.bumptech.glide.j r2 = r2.mo7637a(r0)
            g.a.a.i.j$g r3 = new g.a.a.i.j$g
            r3.<init>(r5, r4)
            r2.mo7643w0(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342g.p343a.p344a.p358i.C8321j.m45998d(android.content.Context, java.lang.String, int, android.widget.ImageView):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r2 != false) goto L_0x0032;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45999e(java.lang.String r3, int r4, android.widget.ImageView r5, int r6, int r7) {
        /*
            com.bumptech.glide.q.h r0 = new com.bumptech.glide.q.h
            r0.<init>()
            com.bumptech.glide.q.a r0 = r0.mo8375Z(r4)
            com.bumptech.glide.q.h r0 = (com.bumptech.glide.p047q.C2153h) r0
            com.bumptech.glide.q.a r0 = r0.mo8386h()
            com.bumptech.glide.q.h r0 = (com.bumptech.glide.p047q.C2153h) r0
            com.bumptech.glide.q.a r0 = r0.mo8391j(r4)
            com.bumptech.glide.q.h r0 = (com.bumptech.glide.p047q.C2153h) r0
            h.a.a.a.b r1 = new h.a.a.a.b
            r1.<init>(r6, r7)
            com.bumptech.glide.q.a r0 = r0.mo8392j0(r1)
            com.bumptech.glide.q.h r0 = (com.bumptech.glide.p047q.C2153h) r0
            android.content.Context r1 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            com.bumptech.glide.k r1 = com.bumptech.glide.C1719b.m8597t(r1)
            if (r3 == 0) goto L_0x0032
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x0036
        L_0x0032:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
        L_0x0036:
            com.bumptech.glide.j r3 = r1.mo7663t(r3)
            com.bumptech.glide.j r3 = r3.mo7637a(r0)
            g.a.a.i.j$c r0 = new g.a.a.i.j$c
            r0.<init>(r5, r6, r7, r4)
            r3.mo7643w0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342g.p343a.p344a.p358i.C8321j.m45999e(java.lang.String, int, android.widget.ImageView, int, int):void");
    }

    /* renamed from: f */
    public static void m46000f(int i, ImageView imageView) {
        imageView.setImageDrawable(C8343s.m46298f(i));
    }

    /* renamed from: g */
    public static void m46001g(int i, ImageView imageView) {
        C1719b.m8597t(C8345u.m46327h()).mo7662s(Integer.valueOf(i)).mo7637a((C2153h) new C2153h().mo8386h()).mo7645z0(imageView);
    }

    /* renamed from: h */
    public static void m46002h(String str, int i, ImageView imageView) {
        C1719b.m8597t(C8345u.m46327h()).mo7665u(str).mo7637a((C2153h) new C2153h().mo8386h()).mo7643w0(new C8327f(imageView, i));
    }

    /* renamed from: i */
    public static void m46003i(Uri uri, ImageView imageView, int i, int i2) {
        C1719b.m8597t(C8345u.m46327h()).mo7661r(uri).mo7637a((C2153h) ((C2153h) ((C2153h) ((C2153h) ((C2153h) new C2153h().mo8374X(i, i2)).mo8379c()).mo8392j0(new C7190g(C8345u.m46327h(), 5))).mo8384g(C1873j.f6766a)).mo8390i0(true)).mo7643w0(new C8322a(imageView));
    }

    /* renamed from: j */
    public static void m46004j(int i, ImageView imageView) {
        ((C1738j) C1719b.m8597t(C8345u.m46327h()).mo7662s(Integer.valueOf(i)).mo8386h()).mo7645z0(imageView);
    }

    /* renamed from: k */
    public static void m46005k(Uri uri, ImageView imageView, int i, int i2, int i3, int i4) {
        C1719b.m8597t(C8345u.m46327h()).mo7661r(uri).mo7637a((C2153h) ((C2153h) ((C2153h) ((C2153h) ((C2153h) new C2153h().mo8374X(i, i2)).mo8379c()).mo8384g(C1873j.f6766a)).mo8390i0(true)).mo8392j0(new C8356b(i3, i4))).mo7643w0(new C8332k(imageView));
    }

    /* renamed from: l */
    public static void m46006l(String str, int i, ImageView imageView, int i2, int i3) {
        m46007m(str, i, imageView, i2, i3, true, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0035, code lost:
        if (r6 != false) goto L_0x0037;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m46007m(java.lang.String r1, int r2, android.widget.ImageView r3, int r4, int r5, boolean r6, boolean r7) {
        /*
            com.bumptech.glide.q.h r6 = new com.bumptech.glide.q.h
            r6.<init>()
            com.bumptech.glide.q.a r6 = r6.mo8386h()
            com.bumptech.glide.q.h r6 = (com.bumptech.glide.p047q.C2153h) r6
            com.bumptech.glide.q.a r4 = r6.mo8374X(r4, r5)
            com.bumptech.glide.q.h r4 = (com.bumptech.glide.p047q.C2153h) r4
            com.bumptech.glide.q.a r4 = r4.mo8379c()
            com.bumptech.glide.q.h r4 = (com.bumptech.glide.p047q.C2153h) r4
            coocent.music.player.widget.g r5 = new coocent.music.player.widget.g
            android.content.Context r6 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            r0 = 5
            r5.<init>(r6, r0)
            com.bumptech.glide.q.a r4 = r4.mo8392j0(r5)
            com.bumptech.glide.q.h r4 = (com.bumptech.glide.p047q.C2153h) r4
            android.content.Context r5 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            com.bumptech.glide.k r5 = com.bumptech.glide.C1719b.m8597t(r5)
            if (r1 == 0) goto L_0x0037
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x003b
        L_0x0037:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
        L_0x003b:
            com.bumptech.glide.j r1 = r5.mo7663t(r1)
            com.bumptech.glide.j r1 = r1.mo7637a(r4)
            g.a.a.i.j$i r4 = new g.a.a.i.j$i
            r4.<init>(r3, r7, r2)
            r1.mo7643w0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342g.p343a.p344a.p358i.C8321j.m46007m(java.lang.String, int, android.widget.ImageView, int, int, boolean, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m46008n(java.lang.String r0, android.graphics.drawable.Drawable r1, android.widget.ImageView r2, int r3, int r4, boolean r5, boolean r6) {
        /*
            java.lang.String r5 = "http"
            boolean r5 = r0.startsWith(r5)
            r6 = 5
            if (r5 == 0) goto L_0x0036
            com.bumptech.glide.q.h r3 = new com.bumptech.glide.q.h
            r3.<init>()
            com.bumptech.glide.q.a r3 = r3.mo8386h()
            com.bumptech.glide.q.h r3 = (com.bumptech.glide.p047q.C2153h) r3
            com.bumptech.glide.q.a r3 = r3.mo8393k(r1)
            com.bumptech.glide.q.h r3 = (com.bumptech.glide.p047q.C2153h) r3
            com.bumptech.glide.q.a r3 = r3.mo8376a0(r1)
            com.bumptech.glide.q.h r3 = (com.bumptech.glide.p047q.C2153h) r3
            com.bumptech.glide.q.a r3 = r3.mo8379c()
            com.bumptech.glide.q.h r3 = (com.bumptech.glide.p047q.C2153h) r3
            coocent.music.player.widget.g r4 = new coocent.music.player.widget.g
            android.content.Context r5 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            r4.<init>(r5, r6)
            com.bumptech.glide.q.a r3 = r3.mo8392j0(r4)
            com.bumptech.glide.q.h r3 = (com.bumptech.glide.p047q.C2153h) r3
            goto L_0x0068
        L_0x0036:
            com.bumptech.glide.q.h r5 = new com.bumptech.glide.q.h
            r5.<init>()
            com.bumptech.glide.q.a r5 = r5.mo8386h()
            com.bumptech.glide.q.h r5 = (com.bumptech.glide.p047q.C2153h) r5
            com.bumptech.glide.q.a r5 = r5.mo8393k(r1)
            com.bumptech.glide.q.h r5 = (com.bumptech.glide.p047q.C2153h) r5
            com.bumptech.glide.q.a r5 = r5.mo8376a0(r1)
            com.bumptech.glide.q.h r5 = (com.bumptech.glide.p047q.C2153h) r5
            com.bumptech.glide.q.a r3 = r5.mo8374X(r3, r4)
            com.bumptech.glide.q.h r3 = (com.bumptech.glide.p047q.C2153h) r3
            com.bumptech.glide.q.a r3 = r3.mo8379c()
            com.bumptech.glide.q.h r3 = (com.bumptech.glide.p047q.C2153h) r3
            coocent.music.player.widget.g r4 = new coocent.music.player.widget.g
            android.content.Context r5 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            r4.<init>(r5, r6)
            com.bumptech.glide.q.a r3 = r3.mo8392j0(r4)
            com.bumptech.glide.q.h r3 = (com.bumptech.glide.p047q.C2153h) r3
        L_0x0068:
            android.content.Context r4 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            com.bumptech.glide.k r4 = com.bumptech.glide.C1719b.m8597t(r4)
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x0077
            r0 = r1
        L_0x0077:
            com.bumptech.glide.j r0 = r4.mo7663t(r0)
            com.bumptech.glide.j r0 = r0.mo7637a(r3)
            g.a.a.i.j$j r1 = new g.a.a.i.j$j
            r1.<init>(r2)
            r0.mo7643w0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342g.p343a.p344a.p358i.C8321j.m46008n(java.lang.String, android.graphics.drawable.Drawable, android.widget.ImageView, int, int, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003b, code lost:
        if (r0 != false) goto L_0x003d;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m46009o(java.lang.String r2, int r3, android.widget.ImageView r4, int r5, int r6, p342g.p343a.p344a.p346c.C7967t r7) {
        /*
            com.bumptech.glide.q.h r0 = new com.bumptech.glide.q.h
            r0.<init>()
            com.bumptech.glide.q.a r0 = r0.mo8375Z(r3)
            com.bumptech.glide.q.h r0 = (com.bumptech.glide.p047q.C2153h) r0
            com.bumptech.glide.q.a r0 = r0.mo8386h()
            com.bumptech.glide.q.h r0 = (com.bumptech.glide.p047q.C2153h) r0
            com.bumptech.glide.q.a r5 = r0.mo8374X(r5, r6)
            com.bumptech.glide.q.h r5 = (com.bumptech.glide.p047q.C2153h) r5
            com.bumptech.glide.q.a r5 = r5.mo8391j(r3)
            com.bumptech.glide.q.h r5 = (com.bumptech.glide.p047q.C2153h) r5
            coocent.music.player.widget.g r6 = new coocent.music.player.widget.g
            android.content.Context r0 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            r1 = 3
            r6.<init>(r0, r1)
            com.bumptech.glide.q.a r5 = r5.mo8392j0(r6)
            com.bumptech.glide.q.h r5 = (com.bumptech.glide.p047q.C2153h) r5
            android.content.Context r6 = p342g.p343a.p344a.p358i.C8345u.m46327h()
            com.bumptech.glide.k r6 = com.bumptech.glide.C1719b.m8597t(r6)
            if (r2 == 0) goto L_0x003d
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0041
        L_0x003d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
        L_0x0041:
            com.bumptech.glide.j r2 = r6.mo7663t(r2)
            com.bumptech.glide.j r2 = r2.mo7637a(r5)
            g.a.a.i.j$h r3 = new g.a.a.i.j$h
            r3.<init>(r4, r7)
            r2.mo7643w0(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342g.p343a.p344a.p358i.C8321j.m46009o(java.lang.String, int, android.widget.ImageView, int, int, g.a.a.c.t):void");
    }

    /* renamed from: p */
    public static void m46010p(Uri uri, ImageView imageView, int i, int i2, int i3, int i4) {
        int G0 = C8337n.m46065k0(C8345u.m46327h()).mo30099G0();
        C1719b.m8597t(C8345u.m46327h()).mo7661r(uri).mo7637a((C2153h) ((C2153h) ((C2153h) ((C2153h) new C2153h().mo8374X(i, i2)).mo8379c()).mo8385g0(new C2178d(Integer.valueOf(G0)))).mo8392j0(new C8356b(i3, i4))).mo7643w0(new C8323b(imageView));
    }
}
