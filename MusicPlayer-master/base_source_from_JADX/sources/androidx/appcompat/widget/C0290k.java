package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p082e.p109h.p118o.C3703i;

/* renamed from: androidx.appcompat.widget.k */
/* compiled from: AppCompatTextClassifierHelper */
final class C0290k {

    /* renamed from: a */
    private TextView f1344a;

    /* renamed from: b */
    private TextClassifier f1345b;

    C0290k(TextView textView) {
        C3703i.m15827d(textView);
        this.f1344a = textView;
    }

    /* renamed from: a */
    public TextClassifier mo2057a() {
        TextClassifier textClassifier = this.f1345b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1344a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }

    /* renamed from: b */
    public void mo2058b(TextClassifier textClassifier) {
        this.f1345b = textClassifier;
    }
}
