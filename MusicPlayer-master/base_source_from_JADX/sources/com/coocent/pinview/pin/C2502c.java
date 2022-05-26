package com.coocent.pinview.pin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.pinview.C2492i;
import com.coocent.pinview.C2493j;

/* renamed from: com.coocent.pinview.pin.c */
/* compiled from: PinLockAdapter */
public class C2502c extends RecyclerView.C0797h<RecyclerView.C0792c0> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2500a f8862a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2510d f8863b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2509c f8864c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f8865d;

    /* renamed from: e */
    private int[] f8866e = m11723i(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});

    /* renamed from: com.coocent.pinview.pin.c$a */
    /* compiled from: PinLockAdapter */
    public class C2503a extends RecyclerView.C0792c0 {

        /* renamed from: a */
        LinearLayout f8867a;

        /* renamed from: b */
        ImageView f8868b;

        /* renamed from: com.coocent.pinview.pin.c$a$a */
        /* compiled from: PinLockAdapter */
        class C2504a implements View.OnClickListener {
            C2504a(C2502c cVar) {
            }

            public void onClick(View view) {
                if (C2502c.this.f8864c != null) {
                    C2502c.this.f8864c.mo9682a();
                }
            }
        }

        /* renamed from: com.coocent.pinview.pin.c$a$b */
        /* compiled from: PinLockAdapter */
        class C2505b implements View.OnLongClickListener {
            C2505b(C2502c cVar) {
            }

            public boolean onLongClick(View view) {
                if (C2502c.this.f8864c == null) {
                    return true;
                }
                C2502c.this.f8864c.mo9683b();
                return true;
            }
        }

        /* renamed from: com.coocent.pinview.pin.c$a$c */
        /* compiled from: PinLockAdapter */
        class C2506c implements View.OnTouchListener {

            /* renamed from: g */
            private Rect f8872g;

            C2506c(C2502c cVar) {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    C2503a aVar = C2503a.this;
                    aVar.f8868b.setColorFilter(C2502c.this.f8862a.mo9687d());
                    this.f8872g = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }
                if (motionEvent.getAction() == 1) {
                    C2503a.this.f8868b.clearColorFilter();
                }
                if (motionEvent.getAction() != 2 || this.f8872g.contains(view.getLeft() + ((int) motionEvent.getX()), view.getTop() + ((int) motionEvent.getY()))) {
                    return false;
                }
                C2503a.this.f8868b.clearColorFilter();
                return false;
            }
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public C2503a(View view) {
            super(view);
            this.f8867a = (LinearLayout) view.findViewById(C2492i.button);
            this.f8868b = (ImageView) view.findViewById(C2492i.buttonImage);
            if (C2502c.this.f8862a.mo9691h() && C2502c.this.f8865d > 0) {
                this.f8867a.setOnClickListener(new C2504a(C2502c.this));
                this.f8867a.setOnLongClickListener(new C2505b(C2502c.this));
                this.f8867a.setOnTouchListener(new C2506c(C2502c.this));
            }
        }
    }

    /* renamed from: com.coocent.pinview.pin.c$b */
    /* compiled from: PinLockAdapter */
    public class C2507b extends RecyclerView.C0792c0 {

        /* renamed from: a */
        Button f8874a;

        /* renamed from: com.coocent.pinview.pin.c$b$a */
        /* compiled from: PinLockAdapter */
        class C2508a implements View.OnClickListener {
            C2508a(C2502c cVar) {
            }

            public void onClick(View view) {
                if (C2502c.this.f8863b != null) {
                    C2502c.this.f8863b.mo9681a(((Integer) view.getTag()).intValue());
                }
            }
        }

        public C2507b(View view) {
            super(view);
            Button button = (Button) view.findViewById(C2492i.button);
            this.f8874a = button;
            button.setOnClickListener(new C2508a(C2502c.this));
        }
    }

    /* renamed from: com.coocent.pinview.pin.c$c */
    /* compiled from: PinLockAdapter */
    public interface C2509c {
        /* renamed from: a */
        void mo9682a();

        /* renamed from: b */
        void mo9683b();
    }

    /* renamed from: com.coocent.pinview.pin.c$d */
    /* compiled from: PinLockAdapter */
    public interface C2510d {
        /* renamed from: a */
        void mo9681a(int i);
    }

    public C2502c(Context context) {
    }

    /* renamed from: g */
    private void m11721g(C2503a aVar) {
        if (aVar == null) {
            return;
        }
        if (!this.f8862a.mo9691h() || this.f8865d <= 0) {
            aVar.f8867a.setVisibility(8);
            aVar.f8868b.setVisibility(8);
            return;
        }
        aVar.f8867a.setVisibility(0);
        aVar.f8868b.setVisibility(0);
        if (this.f8862a.mo9686c() != null) {
            aVar.f8868b.setImageDrawable(this.f8862a.mo9686c());
        }
        aVar.f8868b.setColorFilter(this.f8862a.mo9689f(), PorterDuff.Mode.SRC_ATOP);
        aVar.f8868b.setLayoutParams(new LinearLayout.LayoutParams(this.f8862a.mo9688e(), this.f8862a.mo9688e()));
    }

    /* renamed from: h */
    private void m11722h(C2507b bVar, int i) {
        if (bVar != null) {
            if (i == 9) {
                bVar.f8874a.setVisibility(8);
            } else {
                bVar.f8874a.setText(String.valueOf(this.f8866e[i]));
                bVar.f8874a.setVisibility(0);
                bVar.f8874a.setTag(Integer.valueOf(this.f8866e[i]));
            }
            C2500a aVar = this.f8862a;
            if (aVar != null) {
                bVar.f8874a.setTextColor(aVar.mo9689f());
                if (this.f8862a.mo9684a() != null) {
                    bVar.f8874a.setBackground(this.f8862a.mo9684a());
                }
                bVar.f8874a.setTextSize(0, (float) this.f8862a.mo9690g());
                bVar.f8874a.setLayoutParams(new LinearLayout.LayoutParams(this.f8862a.mo9685b(), this.f8862a.mo9685b()));
            }
        }
    }

    /* renamed from: i */
    private int[] m11723i(int[] iArr) {
        int[] iArr2 = new int[(iArr.length + 1)];
        for (int i = 0; i < iArr.length; i++) {
            if (i < 9) {
                iArr2[i] = iArr[i];
            } else {
                iArr2[i] = -1;
                iArr2[i + 1] = iArr[i];
            }
        }
        return iArr2;
    }

    public int getItemCount() {
        return 12;
    }

    public int getItemViewType(int i) {
        return i == getItemCount() - 1 ? 1 : 0;
    }

    /* renamed from: j */
    public void mo9700j(C2500a aVar) {
        this.f8862a = aVar;
    }

    /* renamed from: k */
    public void mo9701k(int[] iArr) {
        this.f8866e = m11723i(iArr);
        notifyDataSetChanged();
    }

    /* renamed from: l */
    public void mo9702l(C2509c cVar) {
        this.f8864c = cVar;
    }

    /* renamed from: m */
    public void mo9703m(C2510d dVar) {
        this.f8863b = dVar;
    }

    /* renamed from: n */
    public void mo9704n(int i) {
        this.f8865d = i;
    }

    public void onBindViewHolder(RecyclerView.C0792c0 c0Var, int i) {
        if (c0Var.getItemViewType() == 0) {
            m11722h((C2507b) c0Var, i);
        } else if (c0Var.getItemViewType() == 1) {
            m11721g((C2503a) c0Var);
        }
    }

    public RecyclerView.C0792c0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new C2507b(from.inflate(C2493j.layout_number_item, viewGroup, false));
        }
        return new C2503a(from.inflate(C2493j.layout_delete_item, viewGroup, false));
    }
}
