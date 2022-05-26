package com.coocent.marquee;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: com.coocent.marquee.k */
/* compiled from: MarqueeRecyclerAdapter */
public class C2285k extends RecyclerView.C0797h<C2287b> {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static int f7836d = -1;

    /* renamed from: a */
    private final Activity f7837a;

    /* renamed from: b */
    private ArrayList<C2277g> f7838b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2286a f7839c;

    /* renamed from: com.coocent.marquee.k$a */
    /* compiled from: MarqueeRecyclerAdapter */
    public interface C2286a {
        /* renamed from: Y0 */
        void mo8883Y0(int i);

        /* renamed from: b */
        void mo8884b(int i);

        /* renamed from: m0 */
        void mo8891m0(View view, int i);

        /* renamed from: o */
        void mo8892o(int i);

        /* renamed from: z1 */
        void mo8893z1(int i);
    }

    /* renamed from: com.coocent.marquee.k$b */
    /* compiled from: MarqueeRecyclerAdapter */
    class C2287b extends RecyclerView.C0792c0 {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final MarqueeBorderView f7840a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final TextView f7841b;

        /* renamed from: c */
        private final ImageView f7842c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final ImageView f7843d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final LinearLayout f7844e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final RelativeLayout f7845f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final TextView f7846g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final EditText f7847h;

        /* renamed from: com.coocent.marquee.k$b$a */
        /* compiled from: MarqueeRecyclerAdapter */
        class C2288a implements View.OnClickListener {
            C2288a(C2285k kVar) {
            }

            public void onClick(View view) {
                if (C2285k.this.f7839c != null) {
                    C2285k.this.f7839c.mo8884b(C2287b.this.getAdapterPosition());
                    return;
                }
                Log.d("测试--", getClass().getSimpleName() + "#Viewholder#marqueeBorderView监听为空！");
            }
        }

        /* renamed from: com.coocent.marquee.k$b$b */
        /* compiled from: MarqueeRecyclerAdapter */
        class C2289b implements View.OnClickListener {
            C2289b(C2285k kVar) {
            }

            public void onClick(View view) {
                if (C2285k.this.f7839c != null) {
                    int unused = C2285k.f7836d = C2287b.this.getAdapterPosition();
                    C2285k.this.f7839c.mo8893z1(C2287b.this.getAdapterPosition());
                    return;
                }
                Log.d("测试--", getClass().getSimpleName() + "#Viewholder#nameTv监听为空！");
            }
        }

        /* renamed from: com.coocent.marquee.k$b$c */
        /* compiled from: MarqueeRecyclerAdapter */
        class C2290c implements View.OnFocusChangeListener {
            C2290c(C2285k kVar) {
            }

            public void onFocusChange(View view, boolean z) {
                if (C2285k.this.f7839c == null) {
                    Log.d("测试--", C2290c.class.getSimpleName() + "#Viewholder#nameEt监听为空！");
                } else if (!z) {
                    int unused = C2285k.f7836d = -1;
                    C2285k.this.f7839c.mo8891m0(view, C2287b.this.getAdapterPosition());
                    C2287b.this.f7847h.setBackgroundResource(C2307r.marquee_edit_underline_unselected);
                } else {
                    C2287b.this.f7847h.setBackgroundResource(C2307r.marquee_edit_underline_selected);
                }
            }
        }

        /* renamed from: com.coocent.marquee.k$b$d */
        /* compiled from: MarqueeRecyclerAdapter */
        class C2291d implements View.OnClickListener {
            C2291d(C2285k kVar) {
            }

            public void onClick(View view) {
                if (C2285k.this.f7839c != null) {
                    C2285k.this.f7839c.mo8883Y0(C2287b.this.getAdapterPosition());
                    return;
                }
                Log.d("测试--", getClass().getSimpleName() + "#Viewholder#deleteImg监听为空！");
            }
        }

        /* renamed from: com.coocent.marquee.k$b$e */
        /* compiled from: MarqueeRecyclerAdapter */
        class C2292e implements View.OnClickListener {
            C2292e(C2285k kVar) {
            }

            public void onClick(View view) {
                if (C2285k.this.f7839c != null) {
                    C2285k.this.f7839c.mo8884b(C2287b.this.getAdapterPosition());
                    return;
                }
                Log.d("测试--", getClass().getSimpleName() + "#Viewholder#pickerImg监听为空！");
            }
        }

        /* renamed from: com.coocent.marquee.k$b$f */
        /* compiled from: MarqueeRecyclerAdapter */
        class C2293f implements View.OnClickListener {
            C2293f(C2285k kVar) {
            }

            public void onClick(View view) {
                if (C2285k.this.f7839c != null) {
                    C2285k.this.f7839c.mo8892o(C2287b.this.getAdapterPosition());
                    return;
                }
                Log.d("测试--", getClass().getSimpleName() + "#Viewholder#addRelLayout监听为空！");
            }
        }

        public C2287b(View view) {
            super(view);
            this.f7844e = (LinearLayout) view.findViewById(C2308s.contentLinLayout);
            MarqueeBorderView marqueeBorderView = (MarqueeBorderView) view.findViewById(C2308s.borderView);
            this.f7840a = marqueeBorderView;
            marqueeBorderView.setOnClickListener(new C2288a(C2285k.this));
            TextView textView = (TextView) view.findViewById(C2308s.nameTv);
            this.f7841b = textView;
            textView.setOnClickListener(new C2289b(C2285k.this));
            EditText editText = (EditText) view.findViewById(C2308s.nameEt);
            this.f7847h = editText;
            editText.setOnFocusChangeListener(new C2290c(C2285k.this));
            ImageView imageView = (ImageView) view.findViewById(C2308s.pickerImg);
            this.f7842c = imageView;
            ImageView imageView2 = (ImageView) view.findViewById(C2308s.deleteImg);
            this.f7843d = imageView2;
            imageView2.setOnClickListener(new C2291d(C2285k.this));
            imageView.setOnClickListener(new C2292e(C2285k.this));
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2308s.addRelLayout);
            this.f7845f = relativeLayout;
            relativeLayout.setOnClickListener(new C2293f(C2285k.this));
            this.f7846g = (TextView) view.findViewById(C2308s.addTv);
        }
    }

    public C2285k(Activity activity, ArrayList<C2277g> arrayList) {
        this.f7837a = activity;
        this.f7838b = arrayList;
    }

    /* renamed from: e */
    public void onBindViewHolder(C2287b bVar, int i) {
        int e1 = C2298o.m10758e1();
        if (this.f7838b.size() == i) {
            bVar.f7845f.setVisibility(0);
            bVar.f7844e.setVisibility(8);
            bVar.f7846g.setTextColor(e1);
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.f7846g.setCompoundDrawablesRelativeWithIntrinsicBounds(this.f7837a.getResources().getDrawable(C2298o.m10681E0()), (Drawable) null, (Drawable) null, (Drawable) null);
            }
            if (this.f7839c != null) {
                bVar.f7845f.setEnabled(true);
            } else {
                bVar.f7845f.setEnabled(false);
            }
        } else {
            bVar.f7845f.setVisibility(8);
            bVar.f7844e.setVisibility(0);
            if (i == 0 || i == 1) {
                bVar.f7843d.setVisibility(8);
            } else {
                bVar.f7843d.setVisibility(0);
            }
            if (f7836d == i) {
                bVar.f7841b.setVisibility(8);
                bVar.f7847h.setVisibility(0);
                InputMethodManager inputMethodManager = (InputMethodManager) this.f7837a.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(bVar.f7847h, 2);
                    inputMethodManager.toggleSoftInput(2, 1);
                }
                bVar.f7847h.setText(this.f7838b.get(i).mo9004b());
                bVar.f7847h.setFocusable(true);
                bVar.f7847h.setFocusableInTouchMode(true);
                bVar.f7847h.requestFocus();
                bVar.f7847h.setSelectAllOnFocus(true);
            } else {
                bVar.f7841b.setVisibility(0);
                bVar.f7847h.setVisibility(8);
                bVar.f7847h.clearFocus();
            }
            bVar.f7841b.setText(this.f7838b.get(i).mo9004b());
            bVar.f7840a.setBackgroundColor(Color.parseColor(this.f7838b.get(i).mo9003a()));
            bVar.f7841b.setTextColor(e1);
            bVar.f7847h.setTextColor(e1);
            bVar.f7843d.setImageResource(C2298o.m10726T0());
        }
    }

    /* renamed from: f */
    public C2287b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2287b(LayoutInflater.from(viewGroup.getContext()).inflate(C2310t.marquee_item, viewGroup, false));
    }

    /* renamed from: g */
    public void mo9014g(C2286a aVar) {
        this.f7839c = aVar;
    }

    public int getItemCount() {
        return this.f7838b.size() + 1;
    }
}
