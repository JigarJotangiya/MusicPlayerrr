package com.coocent.music.base.p056ui.view;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Objects;
import p159f.p166c.p181e.p182a.p183a.p189f.C4446i;
import p159f.p166c.p181e.p182a.p190b.C4448b;
import p159f.p166c.p181e.p182a.p190b.C4449c;
import p159f.p166c.p181e.p182a.p190b.C4452f;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p159f.p166c.p181e.p182a.p190b.p197l.C4481e;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.coocent.music.base.ui.view.h */
/* compiled from: EditPlaylistDialog.kt */
public final class C2384h extends Dialog {

    /* renamed from: com.coocent.music.base.ui.view.h$a */
    /* compiled from: EditPlaylistDialog.kt */
    public static final class C2385a {

        /* renamed from: a */
        private final Context f8326a;

        /* renamed from: b */
        private final long f8327b;

        /* renamed from: c */
        private TextView f8328c;

        /* renamed from: d */
        private ImageView f8329d;

        /* renamed from: e */
        private final C2387b f8330e = new C2387b();

        /* renamed from: f */
        private EditText f8331f;

        /* renamed from: g */
        private TextView f8332g;

        /* renamed from: h */
        private TextView f8333h;

        /* renamed from: i */
        private C2384h f8334i;

        /* renamed from: com.coocent.music.base.ui.view.h$a$a */
        /* compiled from: EditPlaylistDialog.kt */
        public static final class C2386a implements TextWatcher {

            /* renamed from: g */
            final /* synthetic */ C2385a f8335g;

            C2386a(C2385a aVar) {
                this.f8335g = aVar;
            }

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.f8335g.m11186m(!(charSequence == null || charSequence.length() == 0));
            }
        }

        public C2385a(Context context, long j) {
            C8594l.m46771e(context, "context");
            this.f8326a = context;
            this.f8327b = j;
        }

        /* renamed from: c */
        private final void m11180c(C2384h hVar, C2385a aVar) {
            View inflate = View.inflate(this.f8326a, C4449c.dialog_create_playlist, (ViewGroup) null);
            if (inflate != null) {
                hVar.setContentView(inflate);
                C8594l.m46770d(inflate, "view");
                m11181e(inflate);
                m11187o();
                m11188p();
            }
        }

        /* renamed from: e */
        private final void m11181e(View view) {
            View findViewById = view.findViewById(C4448b.et_playlist_name);
            C8594l.m46770d(findViewById, "view.findViewById(R.id.et_playlist_name)");
            this.f8331f = (EditText) findViewById;
            View findViewById2 = view.findViewById(C4448b.iv_close);
            C8594l.m46770d(findViewById2, "view.findViewById(R.id.iv_close)");
            this.f8329d = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(C4448b.tv_save);
            C8594l.m46770d(findViewById3, "view.findViewById(R.id.tv_save)");
            this.f8332g = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C4448b.tv_cancel);
            C8594l.m46770d(findViewById4, "view.findViewById(R.id.tv_cancel)");
            this.f8333h = (TextView) findViewById4;
            View findViewById5 = view.findViewById(C4448b.tv_title);
            C8594l.m46770d(findViewById5, "view.findViewById(R.id.tv_title)");
            this.f8328c = (TextView) findViewById5;
        }

        /* renamed from: i */
        private final void m11185i(String str) {
            int j0 = C4477c.m19626j0(this.f8326a, str, this.f8327b);
            if (j0 > 0) {
                Toast.makeText(this.f8326a, C4452f.rename_success, 0).show();
                C2388i b = this.f8330e.mo9358b();
                if (b != null) {
                    C2384h hVar = this.f8334i;
                    if (hVar != null) {
                        b.mo9365a(hVar, this.f8327b, str);
                    } else {
                        C8594l.m46783q("editPlaylistDialog");
                        throw null;
                    }
                }
                C2384h hVar2 = this.f8334i;
                if (hVar2 != null) {
                    hVar2.dismiss();
                } else {
                    C8594l.m46783q("editPlaylistDialog");
                    throw null;
                }
            } else if (j0 == -1) {
                Toast.makeText(this.f8326a, C4452f.playlist_renamed_exist, 0).show();
            } else if (j0 == -2) {
                Toast.makeText(this.f8326a, C4452f.music_eq_msg_playlist_name_empty, 0).show();
            } else if (j0 == -3) {
                Toast.makeText(this.f8326a, C4452f.name_limit_100, 0).show();
            } else if (j0 == -4) {
                Toast.makeText(this.f8326a, C4452f.coocent_msgs_operation_failure, 0).show();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public final void m11186m(boolean z) {
            if (z) {
                TextView textView = this.f8332g;
                if (textView != null) {
                    textView.setTextColor(this.f8330e.mo9357a());
                    TextView textView2 = this.f8332g;
                    if (textView2 != null) {
                        textView2.setEnabled(true);
                        TextView textView3 = this.f8332g;
                        if (textView3 != null) {
                            textView3.setClickable(true);
                            ImageView imageView = this.f8329d;
                            if (imageView != null) {
                                imageView.setVisibility(0);
                            } else {
                                C8594l.m46783q("ivClean");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("tvSave");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("tvSave");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("tvSave");
                    throw null;
                }
            } else {
                TextView textView4 = this.f8332g;
                if (textView4 != null) {
                    textView4.setTextColor(C4481e.m19677a(this.f8330e.mo9357a(), 0.5f));
                    TextView textView5 = this.f8332g;
                    if (textView5 != null) {
                        textView5.setEnabled(false);
                        TextView textView6 = this.f8332g;
                        if (textView6 != null) {
                            textView6.setClickable(false);
                            ImageView imageView2 = this.f8329d;
                            if (imageView2 != null) {
                                imageView2.setVisibility(4);
                            } else {
                                C8594l.m46783q("ivClean");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("tvSave");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("tvSave");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("tvSave");
                    throw null;
                }
            }
        }

        /* renamed from: o */
        private final void m11187o() {
            boolean z = true;
            if (this.f8330e.mo9360d().length() == 0) {
                TextView textView = this.f8328c;
                if (textView != null) {
                    textView.setText(this.f8326a.getText(C4452f.edit));
                } else {
                    C8594l.m46783q("tvTitle");
                    throw null;
                }
            } else {
                TextView textView2 = this.f8328c;
                if (textView2 != null) {
                    textView2.setText(this.f8330e.mo9360d());
                } else {
                    C8594l.m46783q("tvTitle");
                    throw null;
                }
            }
            EditText editText = this.f8331f;
            if (editText != null) {
                editText.setText(this.f8330e.mo9359c());
                String c = this.f8330e.mo9359c();
                Objects.requireNonNull(c, "null cannot be cast to non-null type kotlin.CharSequence");
                if (C8437p.m46563l0(c).toString().length() > 0) {
                    ImageView imageView = this.f8329d;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    } else {
                        C8594l.m46783q("ivClean");
                        throw null;
                    }
                }
                EditText editText2 = this.f8331f;
                if (editText2 != null) {
                    editText2.setFocusableInTouchMode(true);
                    EditText editText3 = this.f8331f;
                    if (editText3 != null) {
                        editText3.requestFocus();
                        C2384h hVar = this.f8334i;
                        if (hVar != null) {
                            Window window = hVar.getWindow();
                            if (window != null) {
                                window.setSoftInputMode(5);
                            }
                            if (this.f8330e.mo9357a() != 0) {
                                TextView textView3 = this.f8332g;
                                if (textView3 != null) {
                                    textView3.setTextColor(this.f8330e.mo9357a());
                                    TextView textView4 = this.f8333h;
                                    if (textView4 != null) {
                                        textView4.setTextColor(this.f8330e.mo9357a());
                                        if (Build.VERSION.SDK_INT >= 21) {
                                            int[][] iArr = {new int[]{-16842919}, new int[]{16842919}};
                                            int[] iArr2 = {this.f8330e.mo9357a(), this.f8330e.mo9357a()};
                                            EditText editText4 = this.f8331f;
                                            if (editText4 != null) {
                                                editText4.setBackgroundTintList(new ColorStateList(iArr, iArr2));
                                            } else {
                                                C8594l.m46783q("etPlaylistName");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        C8594l.m46783q("tvCancel");
                                        throw null;
                                    }
                                } else {
                                    C8594l.m46783q("tvSave");
                                    throw null;
                                }
                            }
                            if (this.f8330e.mo9359c().length() != 0) {
                                z = false;
                            }
                            if (z) {
                                m11186m(false);
                                return;
                            }
                            return;
                        }
                        C8594l.m46783q("editPlaylistDialog");
                        throw null;
                    }
                    C8594l.m46783q("etPlaylistName");
                    throw null;
                }
                C8594l.m46783q("etPlaylistName");
                throw null;
            }
            C8594l.m46783q("etPlaylistName");
            throw null;
        }

        /* renamed from: p */
        private final void m11188p() {
            TextView textView = this.f8333h;
            if (textView != null) {
                textView.setOnClickListener(new C2379f(this));
                TextView textView2 = this.f8332g;
                if (textView2 != null) {
                    textView2.setOnClickListener(new C2378e(this));
                    ImageView imageView = this.f8329d;
                    if (imageView != null) {
                        imageView.setOnClickListener(new C2377d(this));
                        EditText editText = this.f8331f;
                        if (editText != null) {
                            editText.addTextChangedListener(new C2386a(this));
                        } else {
                            C8594l.m46783q("etPlaylistName");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("ivClean");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("tvSave");
                    throw null;
                }
            } else {
                C8594l.m46783q("tvCancel");
                throw null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public static final void m11189q(C2385a aVar, View view) {
            C8594l.m46771e(aVar, "this$0");
            C2388i b = aVar.f8330e.mo9358b();
            if (b != null) {
                C2384h hVar = aVar.f8334i;
                if (hVar != null) {
                    b.mo9366b(hVar);
                } else {
                    C8594l.m46783q("editPlaylistDialog");
                    throw null;
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public static final void m11190r(C2385a aVar, View view) {
            C8594l.m46771e(aVar, "this$0");
            EditText editText = aVar.f8331f;
            if (editText != null) {
                String obj = editText.getText().toString();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj2 = C8437p.m46563l0(obj).toString();
                aVar.m11185i(obj2);
                C2388i b = aVar.f8330e.mo9358b();
                if (b != null) {
                    C2384h hVar = aVar.f8334i;
                    if (hVar != null) {
                        b.mo9365a(hVar, aVar.mo9349d(), obj2);
                    } else {
                        C8594l.m46783q("editPlaylistDialog");
                        throw null;
                    }
                }
            } else {
                C8594l.m46783q("etPlaylistName");
                throw null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public static final void m11191s(C2385a aVar, View view) {
            C8594l.m46771e(aVar, "this$0");
            EditText editText = aVar.f8331f;
            if (editText != null) {
                editText.setText(BuildConfig.FLAVOR);
            } else {
                C8594l.m46783q("etPlaylistName");
                throw null;
            }
        }

        /* renamed from: b */
        public final C2384h mo9348b() {
            C2384h hVar = new C2384h(this.f8326a);
            this.f8334i = hVar;
            if (hVar != null) {
                m11180c(hVar, this);
                C2384h hVar2 = this.f8334i;
                if (hVar2 != null) {
                    return hVar2;
                }
                C8594l.m46783q("editPlaylistDialog");
                throw null;
            }
            C8594l.m46783q("editPlaylistDialog");
            throw null;
        }

        /* renamed from: d */
        public final long mo9349d() {
            return this.f8327b;
        }

        /* renamed from: j */
        public final C2385a mo9350j(int i) {
            this.f8330e.mo9361e(i);
            return this;
        }

        /* renamed from: k */
        public final C2385a mo9351k(C2388i iVar) {
            C8594l.m46771e(iVar, "editPlaylistListener");
            this.f8330e.mo9362f(iVar);
            return this;
        }

        /* renamed from: l */
        public final C2385a mo9352l(String str) {
            C8594l.m46771e(str, "inputString");
            this.f8330e.mo9363g(str);
            return this;
        }

        /* renamed from: n */
        public final C2385a mo9353n(String str) {
            C8594l.m46771e(str, "title");
            this.f8330e.mo9364h(str);
            return this;
        }
    }

    /* renamed from: com.coocent.music.base.ui.view.h$b */
    /* compiled from: EditPlaylistDialog.kt */
    public static final class C2387b {

        /* renamed from: a */
        private String f8336a = BuildConfig.FLAVOR;

        /* renamed from: b */
        private String f8337b = BuildConfig.FLAVOR;

        /* renamed from: c */
        private int f8338c;

        /* renamed from: d */
        private C2388i f8339d;

        /* renamed from: a */
        public final int mo9357a() {
            return this.f8338c;
        }

        /* renamed from: b */
        public final C2388i mo9358b() {
            return this.f8339d;
        }

        /* renamed from: c */
        public final String mo9359c() {
            return this.f8336a;
        }

        /* renamed from: d */
        public final String mo9360d() {
            return this.f8337b;
        }

        /* renamed from: e */
        public final void mo9361e(int i) {
            this.f8338c = i;
        }

        /* renamed from: f */
        public final void mo9362f(C2388i iVar) {
            this.f8339d = iVar;
        }

        /* renamed from: g */
        public final void mo9363g(String str) {
            C8594l.m46771e(str, "<set-?>");
            this.f8336a = str;
        }

        /* renamed from: h */
        public final void mo9364h(String str) {
            C8594l.m46771e(str, "<set-?>");
            this.f8337b = str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2384h(Context context) {
        super(context);
        C8594l.m46771e(context, "context");
    }

    public void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            C8594l.m46770d(attributes, "it.attributes");
            C4446i iVar = C4446i.f13022a;
            Context context = getContext();
            C8594l.m46770d(context, "context");
            attributes.width = iVar.mo15138c(context);
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setAttributes(attributes);
            }
        }
    }
}
