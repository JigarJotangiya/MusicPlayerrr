package com.coocent.marquee;

import android.app.Notification;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p369i.C8454q;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.marquee.p */
/* compiled from: NotificationUtil.kt */
public final class C2300p {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static int f8009a = -1;

    /* renamed from: b */
    public static final C2301a f8010b = new C2301a((C8589g) null);

    /* renamed from: com.coocent.marquee.p$a */
    /* compiled from: NotificationUtil.kt */
    public static final class C2301a {

        /* renamed from: com.coocent.marquee.p$a$a */
        /* compiled from: NotificationUtil.kt */
        private interface C2302a {
            /* renamed from: a */
            void mo9044a(View view);
        }

        /* renamed from: com.coocent.marquee.p$a$b */
        /* compiled from: NotificationUtil.kt */
        public interface C2303b {
            /* renamed from: a */
            void mo8907a(boolean z);

            /* renamed from: b */
            void mo8908b(boolean z);
        }

        /* renamed from: com.coocent.marquee.p$a$c */
        /* compiled from: NotificationUtil.kt */
        public static final class C2304c implements C2302a {

            /* renamed from: a */
            final /* synthetic */ List f8011a;

            C2304c(List list) {
                this.f8011a = list;
            }

            /* renamed from: a */
            public void mo9044a(View view) {
                if (view instanceof TextView) {
                    this.f8011a.add(view);
                }
            }
        }

        /* renamed from: com.coocent.marquee.p$a$d */
        /* compiled from: NotificationUtil.kt */
        public static final class C2305d implements C2302a {
            C2305d() {
            }

            /* renamed from: a */
            public void mo9044a(View view) {
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    if (C8594l.m46767a("notification_title", textView.getText().toString())) {
                        C2300p.f8009a = textView.getCurrentTextColor();
                    }
                }
            }
        }

        private C2301a() {
        }

        /* renamed from: a */
        private final int m10845a(ViewGroup viewGroup) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(viewGroup);
            int i = 0;
            while (linkedList.size() > 0) {
                ViewGroup viewGroup2 = (ViewGroup) linkedList.getFirst();
                C8594l.m46768b(viewGroup2, "viewGroup1");
                int childCount = viewGroup2.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (viewGroup2.getChildAt(i2) instanceof ViewGroup) {
                        View childAt = viewGroup2.getChildAt(i2);
                        if (childAt != null) {
                            linkedList.add((ViewGroup) childAt);
                        } else {
                            throw new C8454q("null cannot be cast to non-null type android.view.ViewGroup");
                        }
                    } else if (!(viewGroup2.getChildAt(i2) instanceof TextView)) {
                        continue;
                    } else {
                        View childAt2 = viewGroup2.getChildAt(i2);
                        if (childAt2 == null) {
                            throw new C8454q("null cannot be cast to non-null type android.widget.TextView");
                        } else if (((TextView) childAt2).getCurrentTextColor() == -1) {
                            continue;
                        } else {
                            View childAt3 = viewGroup2.getChildAt(i2);
                            if (childAt3 != null) {
                                i = ((TextView) childAt3).getCurrentTextColor();
                            } else {
                                throw new C8454q("null cannot be cast to non-null type android.widget.TextView");
                            }
                        }
                    }
                }
                linkedList.remove(viewGroup2);
            }
            return i;
        }

        /* renamed from: b */
        private final int m10846b(List<? extends TextView> list) {
            int i = Integer.MIN_VALUE;
            float f = (float) Integer.MIN_VALUE;
            int i2 = 0;
            for (TextView textView : list) {
                if (f < textView.getTextSize()) {
                    f = textView.getTextSize();
                    i = i2;
                }
                i2++;
            }
            return i;
        }

        /* renamed from: d */
        private final List<TextView> m10847d(View view) {
            ArrayList arrayList = new ArrayList();
            m10854k(view, new C2304c(arrayList));
            return arrayList;
        }

        /* renamed from: e */
        private final int m10848e(Context context) {
            int i;
            try {
                if (C2300p.f8009a == -1) {
                    if (context instanceof AppCompatActivity) {
                        i = m10850g(context);
                    } else {
                        i = m10851h(context);
                    }
                    C2300p.f8009a = i;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return C2300p.f8009a;
        }

        /* renamed from: f */
        private final int m10849f(Context context, int i, int i2) {
            Integer num = null;
            View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null, false);
            if (inflate != null) {
                ViewGroup viewGroup = (ViewGroup) inflate;
                TextView textView = (TextView) viewGroup.findViewById(16908310);
                if (textView != null) {
                    num = Integer.valueOf(textView.getCurrentTextColor());
                } else {
                    TextView textView2 = (TextView) viewGroup.findViewById(i2);
                    if (textView2 != null) {
                        num = Integer.valueOf(textView2.getCurrentTextColor());
                    }
                }
                if (num != null) {
                    return num.intValue();
                }
                return m10845a(viewGroup);
            }
            throw new C8454q("null cannot be cast to non-null type android.view.ViewGroup");
        }

        /* renamed from: g */
        private final int m10850g(Context context) {
            try {
                Notification build = new Notification.Builder(context).build();
                C8594l.m46768b(build, "builder.build()");
                RemoteViews remoteViews = build.contentView;
                C8594l.m46768b(remoteViews, "notification.contentView");
                View inflate = LayoutInflater.from(context).inflate(remoteViews.getLayoutId(), (ViewGroup) null);
                if (inflate != null) {
                    ViewGroup viewGroup = (ViewGroup) inflate;
                    TextView textView = (TextView) viewGroup.findViewById(16908310);
                    return textView != null ? textView.getCurrentTextColor() : m10852i(viewGroup);
                }
                throw new C8454q("null cannot be cast to non-null type android.view.ViewGroup");
            } catch (Exception unused) {
                return -1;
            }
        }

        /* renamed from: h */
        private final int m10851h(Context context) {
            Notification.Builder builder = new Notification.Builder(context);
            builder.setContentTitle("notification_title");
            Notification build = builder.build();
            C8594l.m46768b(build, "builder.build()");
            try {
                View apply = build.contentView.apply(context, new FrameLayout(context));
                if (apply != null) {
                    ViewGroup viewGroup = (ViewGroup) apply;
                    TextView textView = (TextView) viewGroup.findViewById(16908310);
                    if (textView != null) {
                        return textView.getCurrentTextColor();
                    }
                    m10854k(viewGroup, new C2305d());
                    return C2300p.f8009a;
                }
                throw new C8454q("null cannot be cast to non-null type android.view.ViewGroup");
            } catch (Exception unused) {
                return m10850g(context);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
            r4 = m10847d(r4);
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final int m10852i(android.view.View r4) {
            /*
                r3 = this;
                r0 = -1
                if (r4 != 0) goto L_0x0004
                return r0
            L_0x0004:
                java.util.List r4 = r3.m10847d(r4)
                int r1 = r3.m10846b(r4)
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r1 == r2) goto L_0x001a
                java.lang.Object r4 = r4.get(r1)
                android.widget.TextView r4 = (android.widget.TextView) r4
                int r0 = r4.getCurrentTextColor()
            L_0x001a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.coocent.marquee.C2300p.C2301a.m10852i(android.view.View):int");
        }

        /* renamed from: j */
        private final boolean m10853j(int i) {
            int i2 = i | -16777216;
            int red = Color.red(-16777216) - Color.red(i2);
            int green = Color.green(-16777216) - Color.green(i2);
            int blue = Color.blue(-16777216) - Color.blue(i2);
            return Math.sqrt(((double) ((red * red) + (green * green))) + ((double) (blue * blue))) < 180.0d;
        }

        /* renamed from: k */
        private final void m10854k(View view, C2302a aVar) {
            if (view != null && aVar != null) {
                aVar.mo9044a(view);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        m10854k(viewGroup.getChildAt(i), aVar);
                    }
                }
            }
        }

        /* renamed from: c */
        public final void mo9043c(Context context, int i, int i2, C2303b bVar) {
            C8594l.m46772f(context, "context");
            C8594l.m46772f(bVar, "onListener");
            try {
                int f = m10849f(context, i, i2);
                int e = m10848e(context);
                if (e == -1) {
                    e = f;
                }
                boolean z = true;
                boolean z2 = !m10853j(e);
                boolean z3 = !m10853j(f);
                if (z2) {
                    if (z2 == z3) {
                        z = false;
                    }
                    bVar.mo8908b(z);
                    return;
                }
                if (z2 == z3) {
                    z = false;
                }
                bVar.mo8907a(z);
            } catch (Exception e2) {
                e2.printStackTrace();
                bVar.mo8907a(false);
            }
        }

        public /* synthetic */ C2301a(C8589g gVar) {
            this();
        }
    }
}
