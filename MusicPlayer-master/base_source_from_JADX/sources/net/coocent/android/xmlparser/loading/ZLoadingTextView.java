package net.coocent.android.xmlparser.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import p391j.p392a.p393a.C8618k;

public class ZLoadingTextView extends ZLoadingView {
    private String mText;

    public ZLoadingTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        super.setLoadingBuilder(Z_TYPE.TEXT);
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8618k.ZLoadingTextView);
            String string = obtainStyledAttributes.getString(C8618k.ZLoadingTextView_z_text);
            obtainStyledAttributes.recycle();
            if (!TextUtils.isEmpty(string)) {
                this.mText = string;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        setText(this.mText);
        super.onAttachedToWindow();
    }

    @Deprecated
    public void setLoadingBuilder(Z_TYPE z_type) {
        super.setLoadingBuilder(Z_TYPE.TEXT);
    }

    public void setText(String str) {
        this.mText = str;
        ZLoadingBuilder zLoadingBuilder = this.mZLoadingBuilder;
        if (zLoadingBuilder instanceof TextBuilder) {
            ((TextBuilder) zLoadingBuilder).setText(str);
        }
    }

    public ZLoadingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ZLoadingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mText = "Zyao89";
        init(context, attributeSet);
    }
}
