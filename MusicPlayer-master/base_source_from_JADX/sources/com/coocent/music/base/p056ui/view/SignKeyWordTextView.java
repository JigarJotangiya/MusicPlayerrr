package com.coocent.music.base.p056ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p159f.p166c.p181e.p182a.p190b.C4453g;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.coocent.music.base.ui.view.SignKeyWordTextView */
/* compiled from: SignKeyWordTextView.kt */
public final class SignKeyWordTextView extends AppCompatTextView {

    /* renamed from: k */
    private String f8303k = BuildConfig.FLAVOR;

    /* renamed from: l */
    private String f8304l;

    /* renamed from: m */
    private int f8305m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignKeyWordTextView(Context context) {
        super(context);
        C8594l.m46769c(context);
    }

    /* renamed from: p */
    private final void m11152p(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C4453g.SignKeyWordTextView);
        C8594l.m46770d(obtainStyledAttributes, "context.obtainStyledAttributes(attrs, R.styleable.SignKeyWordTextView)");
        this.f8304l = obtainStyledAttributes.getString(C4453g.SignKeyWordTextView_signText);
        this.f8305m = obtainStyledAttributes.getColor(C4453g.SignKeyWordTextView_signTextColor, getTextColors().getDefaultColor());
        obtainStyledAttributes.recycle();
    }

    /* renamed from: q */
    private final SpannableStringBuilder m11153q() {
        if (TextUtils.isEmpty(this.f8303k)) {
            return new SpannableStringBuilder(BuildConfig.FLAVOR);
        }
        if (TextUtils.isEmpty(this.f8304l)) {
            return new SpannableStringBuilder(this.f8303k);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f8303k);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f8305m);
        String str = this.f8304l;
        C8594l.m46769c(str);
        Locale locale = Locale.ROOT;
        C8594l.m46770d(locale, "ROOT");
        String lowerCase = str.toLowerCase(locale);
        C8594l.m46770d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        Pattern compile = Pattern.compile(String.valueOf(lowerCase.charAt(0)));
        String str2 = this.f8303k;
        C8594l.m46770d(locale, "ROOT");
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String lowerCase2 = str2.toLowerCase(locale);
        C8594l.m46770d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
        Matcher matcher = compile.matcher(lowerCase2);
        if (matcher.find()) {
            try {
                int start = matcher.start();
                int start2 = matcher.start();
                String str3 = this.f8304l;
                C8594l.m46769c(str3);
                spannableStringBuilder.setSpan(foregroundColorSpan, start, start2 + str3.length(), 33);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return spannableStringBuilder;
    }

    public final void setSignText(String str) {
        this.f8304l = str;
        setText(this.f8303k);
    }

    public final void setSignTextColor(int i) {
        this.f8305m = i;
        setText(this.f8303k);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C8594l.m46771e(charSequence, "text");
        C8594l.m46771e(bufferType, "type");
        this.f8303k = charSequence.toString();
        String str = this.f8304l;
        if (str != null) {
            C8594l.m46769c(str);
            if (!(str.length() == 0)) {
                super.setText(m11153q(), bufferType);
                return;
            }
        }
        super.setText(charSequence, bufferType);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignKeyWordTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8594l.m46769c(context);
        m11152p(attributeSet);
    }
}
