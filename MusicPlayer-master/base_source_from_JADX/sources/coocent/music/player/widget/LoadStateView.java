package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import net.coocent.android.xmlparser.p461z.C9566f;
import p342g.p343a.p344a.p346c.C7964q;

public class LoadStateView extends LinearLayout implements View.OnClickListener {

    /* renamed from: g */
    private ImageView f31598g;

    /* renamed from: h */
    private TextView f31599h;

    /* renamed from: i */
    private TextView f31600i;

    /* renamed from: j */
    private C7964q f31601j;

    /* renamed from: k */
    private View f31602k;

    public LoadStateView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m40692a() {
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        setLayoutParams(layoutParams);
        this.f31598g = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C9566f.m50190a(getContext(), 120), C9566f.m50190a(getContext(), 120));
        layoutParams2.gravity = 1;
        this.f31598g.setLayoutParams(layoutParams2);
        this.f31599h = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = C9566f.m50190a(getContext(), 10);
        this.f31599h.setLayoutParams(layoutParams3);
        this.f31600i = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        layoutParams4.topMargin = C9566f.m50190a(getContext(), 10);
        this.f31600i.setLayoutParams(layoutParams4);
        addView(this.f31598g);
        addView(this.f31599h);
        addView(this.f31600i);
        this.f31602k = new ProgressBar(getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 17;
        this.f31602k.setLayoutParams(layoutParams5);
        addView(this.f31602k);
        this.f31600i.setOnClickListener(this);
    }

    private void setStateVisible(boolean z) {
        TextView textView = this.f31600i;
        int i = 8;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
        ImageView imageView = this.f31598g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
        TextView textView2 = this.f31599h;
        if (textView2 != null) {
            textView2.setVisibility(z ? 0 : 8);
        }
        View view = this.f31602k;
        if (view != null) {
            if (!z) {
                i = 0;
            }
            view.setVisibility(i);
        }
        setVisibility(0);
    }

    public void onClick(View view) {
        if (this.f31601j != null) {
            setVisibility(8);
            this.f31601j.mo29491a();
        }
    }

    public void setRetryListener(C7964q qVar) {
        this.f31601j = qVar;
    }

    public LoadStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40692a();
    }

    public LoadStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
