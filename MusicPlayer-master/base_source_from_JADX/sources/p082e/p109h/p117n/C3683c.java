package p082e.p109h.p117n;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p082e.p109h.p118o.C3698d;

/* renamed from: e.h.n.c */
/* compiled from: PrecomputedTextCompat */
public class C3683c implements Spannable {

    /* renamed from: g */
    private final Spannable f11689g;

    /* renamed from: h */
    private final C3684a f11690h;

    /* renamed from: i */
    private final PrecomputedText f11691i;

    /* renamed from: a */
    public C3684a mo12966a() {
        return this.f11690h;
    }

    /* renamed from: b */
    public PrecomputedText mo12967b() {
        Spannable spannable = this.f11689g;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f11689g.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f11689g.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f11689g.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f11689g.getSpanStart(obj);
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f11691i.getSpans(i, i2, cls);
        }
        return this.f11689g.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f11689g.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f11689g.nextSpanTransition(i, i2, cls);
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f11691i.removeSpan(obj);
        } else {
            this.f11689g.removeSpan(obj);
        }
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f11691i.setSpan(obj, i, i2, i3);
        } else {
            this.f11689g.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f11689g.subSequence(i, i2);
    }

    public String toString() {
        return this.f11689g.toString();
    }

    /* renamed from: e.h.n.c$a */
    /* compiled from: PrecomputedTextCompat */
    public static final class C3684a {

        /* renamed from: a */
        private final TextPaint f11692a;

        /* renamed from: b */
        private final TextDirectionHeuristic f11693b;

        /* renamed from: c */
        private final int f11694c;

        /* renamed from: d */
        private final int f11695d;

        /* renamed from: e.h.n.c$a$a */
        /* compiled from: PrecomputedTextCompat */
        public static class C3685a {

            /* renamed from: a */
            private final TextPaint f11696a;

            /* renamed from: b */
            private TextDirectionHeuristic f11697b;

            /* renamed from: c */
            private int f11698c;

            /* renamed from: d */
            private int f11699d;

            public C3685a(TextPaint textPaint) {
                this.f11696a = textPaint;
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    this.f11698c = 1;
                    this.f11699d = 1;
                } else {
                    this.f11699d = 0;
                    this.f11698c = 0;
                }
                if (i >= 18) {
                    this.f11697b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f11697b = null;
                }
            }

            /* renamed from: a */
            public C3684a mo12987a() {
                return new C3684a(this.f11696a, this.f11697b, this.f11698c, this.f11699d);
            }

            /* renamed from: b */
            public C3685a mo12988b(int i) {
                this.f11698c = i;
                return this;
            }

            /* renamed from: c */
            public C3685a mo12989c(int i) {
                this.f11699d = i;
                return this;
            }

            /* renamed from: d */
            public C3685a mo12990d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f11697b = textDirectionHeuristic;
                return this;
            }
        }

        @SuppressLint({"NewApi"})
        C3684a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f11692a = textPaint;
            this.f11693b = textDirectionHeuristic;
            this.f11694c = i;
            this.f11695d = i2;
        }

        /* renamed from: a */
        public boolean mo12979a(C3684a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f11694c != aVar.mo12980b() || this.f11695d != aVar.mo12981c())) || this.f11692a.getTextSize() != aVar.mo12983e().getTextSize() || this.f11692a.getTextScaleX() != aVar.mo12983e().getTextScaleX() || this.f11692a.getTextSkewX() != aVar.mo12983e().getTextSkewX()) {
                return false;
            }
            if ((i >= 21 && (this.f11692a.getLetterSpacing() != aVar.mo12983e().getLetterSpacing() || !TextUtils.equals(this.f11692a.getFontFeatureSettings(), aVar.mo12983e().getFontFeatureSettings()))) || this.f11692a.getFlags() != aVar.mo12983e().getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f11692a.getTextLocales().equals(aVar.mo12983e().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f11692a.getTextLocale().equals(aVar.mo12983e().getTextLocale())) {
                return false;
            }
            if (this.f11692a.getTypeface() == null) {
                if (aVar.mo12983e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f11692a.getTypeface().equals(aVar.mo12983e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: b */
        public int mo12980b() {
            return this.f11694c;
        }

        /* renamed from: c */
        public int mo12981c() {
            return this.f11695d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic mo12982d() {
            return this.f11693b;
        }

        /* renamed from: e */
        public TextPaint mo12983e() {
            return this.f11692a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3684a)) {
                return false;
            }
            C3684a aVar = (C3684a) obj;
            if (!mo12979a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f11693b == aVar.mo12982d();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C3698d.m15815b(Float.valueOf(this.f11692a.getTextSize()), Float.valueOf(this.f11692a.getTextScaleX()), Float.valueOf(this.f11692a.getTextSkewX()), Float.valueOf(this.f11692a.getLetterSpacing()), Integer.valueOf(this.f11692a.getFlags()), this.f11692a.getTextLocales(), this.f11692a.getTypeface(), Boolean.valueOf(this.f11692a.isElegantTextHeight()), this.f11693b, Integer.valueOf(this.f11694c), Integer.valueOf(this.f11695d));
            } else if (i >= 21) {
                return C3698d.m15815b(Float.valueOf(this.f11692a.getTextSize()), Float.valueOf(this.f11692a.getTextScaleX()), Float.valueOf(this.f11692a.getTextSkewX()), Float.valueOf(this.f11692a.getLetterSpacing()), Integer.valueOf(this.f11692a.getFlags()), this.f11692a.getTextLocale(), this.f11692a.getTypeface(), Boolean.valueOf(this.f11692a.isElegantTextHeight()), this.f11693b, Integer.valueOf(this.f11694c), Integer.valueOf(this.f11695d));
            } else if (i >= 18) {
                return C3698d.m15815b(Float.valueOf(this.f11692a.getTextSize()), Float.valueOf(this.f11692a.getTextScaleX()), Float.valueOf(this.f11692a.getTextSkewX()), Integer.valueOf(this.f11692a.getFlags()), this.f11692a.getTextLocale(), this.f11692a.getTypeface(), this.f11693b, Integer.valueOf(this.f11694c), Integer.valueOf(this.f11695d));
            } else if (i >= 17) {
                return C3698d.m15815b(Float.valueOf(this.f11692a.getTextSize()), Float.valueOf(this.f11692a.getTextScaleX()), Float.valueOf(this.f11692a.getTextSkewX()), Integer.valueOf(this.f11692a.getFlags()), this.f11692a.getTextLocale(), this.f11692a.getTypeface(), this.f11693b, Integer.valueOf(this.f11694c), Integer.valueOf(this.f11695d));
            } else {
                return C3698d.m15815b(Float.valueOf(this.f11692a.getTextSize()), Float.valueOf(this.f11692a.getTextScaleX()), Float.valueOf(this.f11692a.getTextSkewX()), Integer.valueOf(this.f11692a.getFlags()), this.f11692a.getTypeface(), this.f11693b, Integer.valueOf(this.f11694c), Integer.valueOf(this.f11695d));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f11692a.getTextSize());
            sb.append(", textScaleX=" + this.f11692a.getTextScaleX());
            sb.append(", textSkewX=" + this.f11692a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                sb.append(", letterSpacing=" + this.f11692a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f11692a.isElegantTextHeight());
            }
            if (i >= 24) {
                sb.append(", textLocale=" + this.f11692a.getTextLocales());
            } else if (i >= 17) {
                sb.append(", textLocale=" + this.f11692a.getTextLocale());
            }
            sb.append(", typeface=" + this.f11692a.getTypeface());
            if (i >= 26) {
                sb.append(", variationSettings=" + this.f11692a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f11693b);
            sb.append(", breakStrategy=" + this.f11694c);
            sb.append(", hyphenationFrequency=" + this.f11695d);
            sb.append("}");
            return sb.toString();
        }

        public C3684a(PrecomputedText.Params params) {
            this.f11692a = params.getTextPaint();
            this.f11693b = params.getTextDirection();
            this.f11694c = params.getBreakStrategy();
            this.f11695d = params.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }
    }
}
