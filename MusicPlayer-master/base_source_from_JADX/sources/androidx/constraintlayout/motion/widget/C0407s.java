package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.C0400q;
import androidx.constraintlayout.widget.C0430c;
import androidx.constraintlayout.widget.C0438e;
import androidx.constraintlayout.widget.C0439f;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import p082e.p099f.p100a.p101k.p102a.C3500c;
import p082e.p099f.p100a.p101k.p102a.C3502d;

/* renamed from: androidx.constraintlayout.motion.widget.s */
/* compiled from: ViewTransition */
public class C0407s {

    /* renamed from: v */
    private static String f1991v = "ViewTransition";

    /* renamed from: a */
    private int f1992a;

    /* renamed from: b */
    private int f1993b = -1;

    /* renamed from: c */
    private boolean f1994c = false;

    /* renamed from: d */
    private int f1995d = 0;

    /* renamed from: e */
    int f1996e;

    /* renamed from: f */
    C0387h f1997f;

    /* renamed from: g */
    C0430c.C0431a f1998g;

    /* renamed from: h */
    private int f1999h = -1;

    /* renamed from: i */
    private int f2000i = -1;

    /* renamed from: j */
    private int f2001j;

    /* renamed from: k */
    private String f2002k;

    /* renamed from: l */
    private int f2003l = 0;

    /* renamed from: m */
    private String f2004m = null;

    /* renamed from: n */
    private int f2005n = -1;

    /* renamed from: o */
    Context f2006o;

    /* renamed from: p */
    private int f2007p = -1;

    /* renamed from: q */
    private int f2008q = -1;

    /* renamed from: r */
    private int f2009r = -1;

    /* renamed from: s */
    private int f2010s = -1;

    /* renamed from: t */
    private int f2011t = -1;

    /* renamed from: u */
    private int f2012u = -1;

    /* renamed from: androidx.constraintlayout.motion.widget.s$a */
    /* compiled from: ViewTransition */
    class C0408a implements Interpolator {

        /* renamed from: a */
        final /* synthetic */ C3500c f2013a;

        C0408a(C0407s sVar, C3500c cVar) {
            this.f2013a = cVar;
        }

        public float getInterpolation(float f) {
            return (float) this.f2013a.mo12523a((double) f);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$b */
    /* compiled from: ViewTransition */
    static class C0409b {

        /* renamed from: a */
        private final int f2014a;

        /* renamed from: b */
        private final int f2015b;

        /* renamed from: c */
        long f2016c;

        /* renamed from: d */
        C0396n f2017d;

        /* renamed from: e */
        int f2018e;

        /* renamed from: f */
        C3502d f2019f = new C3502d();

        /* renamed from: g */
        C0410t f2020g;

        /* renamed from: h */
        Interpolator f2021h;

        /* renamed from: i */
        boolean f2022i = false;

        /* renamed from: j */
        float f2023j;

        /* renamed from: k */
        float f2024k;

        /* renamed from: l */
        long f2025l;

        /* renamed from: m */
        Rect f2026m = new Rect();

        /* renamed from: n */
        boolean f2027n = false;

        C0409b(C0410t tVar, C0396n nVar, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            this.f2020g = tVar;
            this.f2017d = nVar;
            this.f2018e = i2;
            long nanoTime = System.nanoTime();
            this.f2016c = nanoTime;
            this.f2025l = nanoTime;
            this.f2020g.mo2729b(this);
            this.f2021h = interpolator;
            this.f2014a = i4;
            this.f2015b = i5;
            if (i3 == 3) {
                this.f2027n = true;
            }
            this.f2024k = i == 0 ? Float.MAX_VALUE : 1.0f / ((float) i);
            mo2723a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2723a() {
            if (this.f2022i) {
                mo2725c();
            } else {
                mo2724b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2724b() {
            long nanoTime = System.nanoTime();
            this.f2025l = nanoTime;
            float f = this.f2023j + (((float) (((double) (nanoTime - this.f2025l)) * 1.0E-6d)) * this.f2024k);
            this.f2023j = f;
            if (f >= 1.0f) {
                this.f2023j = 1.0f;
            }
            Interpolator interpolator = this.f2021h;
            float interpolation = interpolator == null ? this.f2023j : interpolator.getInterpolation(this.f2023j);
            C0396n nVar = this.f2017d;
            boolean x = nVar.mo2603x(nVar.f1870b, interpolation, nanoTime, this.f2019f);
            if (this.f2023j >= 1.0f) {
                if (this.f2014a != -1) {
                    this.f2017d.mo2602v().setTag(this.f2014a, Long.valueOf(System.nanoTime()));
                }
                if (this.f2015b != -1) {
                    this.f2017d.mo2602v().setTag(this.f2015b, (Object) null);
                }
                if (!this.f2027n) {
                    this.f2020g.mo2733g(this);
                }
            }
            if (this.f2023j < 1.0f || x) {
                this.f2020g.mo2732e();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2725c() {
            long nanoTime = System.nanoTime();
            this.f2025l = nanoTime;
            float f = this.f2023j - (((float) (((double) (nanoTime - this.f2025l)) * 1.0E-6d)) * this.f2024k);
            this.f2023j = f;
            if (f < 0.0f) {
                this.f2023j = 0.0f;
            }
            Interpolator interpolator = this.f2021h;
            float interpolation = interpolator == null ? this.f2023j : interpolator.getInterpolation(this.f2023j);
            C0396n nVar = this.f2017d;
            boolean x = nVar.mo2603x(nVar.f1870b, interpolation, nanoTime, this.f2019f);
            if (this.f2023j <= 0.0f) {
                if (this.f2014a != -1) {
                    this.f2017d.mo2602v().setTag(this.f2014a, Long.valueOf(System.nanoTime()));
                }
                if (this.f2015b != -1) {
                    this.f2017d.mo2602v().setTag(this.f2015b, (Object) null);
                }
                this.f2020g.mo2733g(this);
            }
            if (this.f2023j > 0.0f || x) {
                this.f2020g.mo2732e();
            }
        }

        /* renamed from: d */
        public void mo2726d(int i, float f, float f2) {
            if (i != 1) {
                if (i == 2) {
                    this.f2017d.mo2602v().getHitRect(this.f2026m);
                    if (!this.f2026m.contains((int) f, (int) f2) && !this.f2022i) {
                        mo2727e(true);
                    }
                }
            } else if (!this.f2022i) {
                mo2727e(true);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2727e(boolean z) {
            int i;
            this.f2022i = z;
            if (z && (i = this.f2018e) != -1) {
                this.f2024k = i == 0 ? Float.MAX_VALUE : 1.0f / ((float) i);
            }
            this.f2020g.mo2732e();
            this.f2025l = System.nanoTime();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0407s(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.f1993b = r0
            r1 = 0
            r9.f1994c = r1
            r9.f1995d = r1
            r9.f1999h = r0
            r9.f2000i = r0
            r9.f2003l = r1
            r2 = 0
            r9.f2004m = r2
            r9.f2005n = r0
            r9.f2007p = r0
            r9.f2008q = r0
            r9.f2009r = r0
            r9.f2010s = r0
            r9.f2011t = r0
            r9.f2012u = r0
            r9.f2006o = r10
            int r2 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
        L_0x0028:
            r3 = 1
            if (r2 == r3) goto L_0x00fe
            java.lang.String r4 = "ViewTransition"
            r5 = 3
            r6 = 2
            if (r2 == r6) goto L_0x0040
            if (r2 == r5) goto L_0x0035
            goto L_0x00ef
        L_0x0035:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            boolean r2 = r4.equals(r2)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            if (r2 == 0) goto L_0x00ef
            return
        L_0x0040:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            int r7 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            r8 = 4
            switch(r7) {
                case -1962203927: goto L_0x0073;
                case -1239391468: goto L_0x0069;
                case 61998586: goto L_0x0061;
                case 366511058: goto L_0x0057;
                case 1791837707: goto L_0x004d;
                default: goto L_0x004c;
            }     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
        L_0x004c:
            goto L_0x007d
        L_0x004d:
            java.lang.String r4 = "CustomAttribute"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            if (r4 == 0) goto L_0x007d
            r4 = 3
            goto L_0x007e
        L_0x0057:
            java.lang.String r4 = "CustomMethod"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            if (r4 == 0) goto L_0x007d
            r4 = 4
            goto L_0x007e
        L_0x0061:
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            if (r4 == 0) goto L_0x007d
            r4 = 0
            goto L_0x007e
        L_0x0069:
            java.lang.String r4 = "KeyFrameSet"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            if (r4 == 0) goto L_0x007d
            r4 = 1
            goto L_0x007e
        L_0x0073:
            java.lang.String r4 = "ConstraintOverride"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            if (r4 == 0) goto L_0x007d
            r4 = 2
            goto L_0x007e
        L_0x007d:
            r4 = -1
        L_0x007e:
            if (r4 == 0) goto L_0x00ec
            if (r4 == r3) goto L_0x00e4
            if (r4 == r6) goto L_0x00dd
            if (r4 == r5) goto L_0x00d5
            if (r4 == r8) goto L_0x00d5
            java.lang.String r3 = f1991v     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            java.lang.String r4 = androidx.constraintlayout.motion.widget.C0379b.m2239a()     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            int r5 = r5.length()     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            int r5 = r5 + 13
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            int r6 = r6.length()     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            r6.<init>(r5)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            r6.append(r4)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            java.lang.String r4 = " unknown tag "
            r6.append(r4)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            r6.append(r2)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            java.lang.String r2 = r6.toString()     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            android.util.Log.e(r3, r2)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            java.lang.String r2 = f1991v     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            int r3 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            r4 = 16
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            r5.<init>(r4)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            java.lang.String r4 = ".xml:"
            r5.append(r4)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            r5.append(r3)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            java.lang.String r3 = r5.toString()     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            android.util.Log.e(r2, r3)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            goto L_0x00ef
        L_0x00d5:
            androidx.constraintlayout.widget.c$a r2 = r9.f1998g     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r2.f2331g     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            androidx.constraintlayout.widget.C0424a.m2733i(r10, r11, r2)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            goto L_0x00ef
        L_0x00dd:
            androidx.constraintlayout.widget.c$a r2 = androidx.constraintlayout.widget.C0430c.m2767m(r10, r11)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            r9.f1998g = r2     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            goto L_0x00ef
        L_0x00e4:
            androidx.constraintlayout.motion.widget.h r2 = new androidx.constraintlayout.motion.widget.h     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            r2.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            r9.f1997f = r2     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            goto L_0x00ef
        L_0x00ec:
            r9.m2610l(r10, r11)     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
        L_0x00ef:
            int r2 = r11.next()     // Catch:{ XmlPullParserException -> 0x00fa, IOException -> 0x00f5 }
            goto L_0x0028
        L_0x00f5:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00fe
        L_0x00fa:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0407s.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void mo2718j(View[] viewArr) {
        if (this.f2007p != -1) {
            for (View tag : viewArr) {
                tag.setTag(this.f2007p, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f2008q != -1) {
            for (View tag2 : viewArr) {
                tag2.setTag(this.f2008q, (Object) null);
            }
        }
    }

    /* renamed from: l */
    private void m2610l(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0439f.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0439f.ViewTransition_android_id) {
                this.f1992a = obtainStyledAttributes.getResourceId(index, this.f1992a);
            } else if (index == C0439f.ViewTransition_motionTarget) {
                if (MotionLayout.f1622Y0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f2001j);
                    this.f2001j = resourceId;
                    if (resourceId == -1) {
                        this.f2002k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f2002k = obtainStyledAttributes.getString(index);
                } else {
                    this.f2001j = obtainStyledAttributes.getResourceId(index, this.f2001j);
                }
            } else if (index == C0439f.ViewTransition_onStateTransition) {
                this.f1993b = obtainStyledAttributes.getInt(index, this.f1993b);
            } else if (index == C0439f.ViewTransition_transitionDisable) {
                this.f1994c = obtainStyledAttributes.getBoolean(index, this.f1994c);
            } else if (index == C0439f.ViewTransition_pathMotionArc) {
                this.f1995d = obtainStyledAttributes.getInt(index, this.f1995d);
            } else if (index == C0439f.ViewTransition_duration) {
                this.f1999h = obtainStyledAttributes.getInt(index, this.f1999h);
            } else if (index == C0439f.ViewTransition_upDuration) {
                this.f2000i = obtainStyledAttributes.getInt(index, this.f2000i);
            } else if (index == C0439f.ViewTransition_viewTransitionMode) {
                this.f1996e = obtainStyledAttributes.getInt(index, this.f1996e);
            } else if (index == C0439f.ViewTransition_motionInterpolator) {
                int i2 = obtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f2005n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f2003l = -2;
                    }
                } else if (i2 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2004m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f2003l = -1;
                    } else {
                        this.f2005n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f2003l = -2;
                    }
                } else {
                    this.f2003l = obtainStyledAttributes.getInteger(index, this.f2003l);
                }
            } else if (index == C0439f.ViewTransition_setsTag) {
                this.f2007p = obtainStyledAttributes.getResourceId(index, this.f2007p);
            } else if (index == C0439f.ViewTransition_clearsTag) {
                this.f2008q = obtainStyledAttributes.getResourceId(index, this.f2008q);
            } else if (index == C0439f.ViewTransition_ifTagSet) {
                this.f2009r = obtainStyledAttributes.getResourceId(index, this.f2009r);
            } else if (index == C0439f.ViewTransition_ifTagNotSet) {
                this.f2010s = obtainStyledAttributes.getResourceId(index, this.f2010s);
            } else if (index == C0439f.ViewTransition_SharedValueId) {
                this.f2012u = obtainStyledAttributes.getResourceId(index, this.f2012u);
            } else if (index == C0439f.ViewTransition_SharedValue) {
                this.f2011t = obtainStyledAttributes.getInteger(index, this.f2011t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: n */
    private void m2611n(C0400q.C0402b bVar, View view) {
        int i = this.f1999h;
        if (i != -1) {
            bVar.mo2669E(i);
        }
        bVar.mo2673I(this.f1995d);
        bVar.mo2671G(this.f2003l, this.f2004m, this.f2005n);
        int id = view.getId();
        C0387h hVar = this.f1997f;
        if (hVar != null) {
            ArrayList<C0382e> d = hVar.mo2558d(-1);
            C0387h hVar2 = new C0387h();
            Iterator<C0382e> it = d.iterator();
            while (it.hasNext()) {
                C0382e b = it.next().clone();
                b.mo2548i(id);
                hVar2.mo2557c(b);
            }
            bVar.mo2674t(hVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2710a(C0410t tVar, MotionLayout motionLayout, View view) {
        C0396n nVar = new C0396n(view);
        nVar.mo2574B(view);
        this.f1997f.mo2555a(nVar);
        nVar.mo2581I(motionLayout.getWidth(), motionLayout.getHeight(), (float) this.f1999h, System.nanoTime());
        C0410t tVar2 = tVar;
        C0396n nVar2 = nVar;
        new C0409b(tVar2, nVar2, this.f1999h, this.f2000i, this.f1993b, mo2714e(motionLayout.getContext()), this.f2007p, this.f2008q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2711b(C0410t tVar, MotionLayout motionLayout, int i, C0430c cVar, View... viewArr) {
        if (!this.f1994c) {
            int i2 = this.f1996e;
            if (i2 == 2) {
                mo2710a(tVar, motionLayout, viewArr[0]);
                return;
            }
            if (i2 == 1) {
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                for (int i3 : constraintSetIds) {
                    if (i3 != i) {
                        C0430c m0 = motionLayout.mo2471m0(i3);
                        for (View id : viewArr) {
                            C0430c.C0431a w = m0.mo2965w(id.getId());
                            C0430c.C0431a aVar = this.f1998g;
                            if (aVar != null) {
                                aVar.mo2970d(w);
                                w.f2331g.putAll(this.f1998g.f2331g);
                            }
                        }
                    }
                }
            }
            C0430c cVar2 = new C0430c();
            cVar2.mo2962q(cVar);
            for (View id2 : viewArr) {
                C0430c.C0431a w2 = cVar2.mo2965w(id2.getId());
                C0430c.C0431a aVar2 = this.f1998g;
                if (aVar2 != null) {
                    aVar2.mo2970d(w2);
                    w2.f2331g.putAll(this.f1998g.f2331g);
                }
            }
            motionLayout.mo2447L0(i, cVar2);
            int i4 = C0438e.view_transition;
            motionLayout.mo2447L0(i4, cVar);
            motionLayout.mo2506y0(i4, -1, -1);
            C0400q.C0402b bVar = new C0400q.C0402b(-1, motionLayout.f1623A, i4, i);
            for (View n : viewArr) {
                m2611n(bVar, n);
            }
            motionLayout.setTransition(bVar);
            motionLayout.mo2440E0(new C0378a(this, viewArr));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo2712c(View view) {
        int i = this.f2009r;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.f2010s;
        boolean z2 = i2 == -1 || view.getTag(i2) == null;
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo2713d() {
        return this.f1992a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Interpolator mo2714e(Context context) {
        int i = this.f2003l;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, this.f2005n);
        }
        if (i == -1) {
            return new C0408a(this, C3500c.m15017c(this.f2004m));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* renamed from: f */
    public int mo2715f() {
        return this.f2011t;
    }

    /* renamed from: g */
    public int mo2716g() {
        return this.f2012u;
    }

    /* renamed from: h */
    public int mo2717h() {
        return this.f1993b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo2719k(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f2001j == -1 && this.f2002k == null) || !mo2712c(view)) {
            return false;
        }
        if (view.getId() == this.f2001j) {
            return true;
        }
        if (this.f2002k != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).f2209Z) != null && str.matches(this.f2002k)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo2720m(int i) {
        int i2 = this.f1993b;
        return i2 == 1 ? i == 0 : i2 == 2 ? i == 1 : i2 == 3 && i == 0;
    }

    public String toString() {
        String c = C0379b.m2241c(this.f2006o, this.f1992a);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 16);
        sb.append("ViewTransition(");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
