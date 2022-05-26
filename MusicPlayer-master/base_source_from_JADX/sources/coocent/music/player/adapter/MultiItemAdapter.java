package coocent.music.player.adapter;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.IExpandable;
import com.coocent.music.base.data.entity.C2342b;
import com.google.android.gms.ads.nativead.C3098a;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p355g.C8291f;
import p342g.p343a.p344a.p355g.C8293g;
import p342g.p343a.p344a.p358i.C8343s;

public abstract class MultiItemAdapter<T extends C2342b, K extends BaseViewHolder> extends BaseQuickAdapter<T, K> {

    /* renamed from: a */
    private SparseIntArray f31096a;

    /* renamed from: coocent.music.player.adapter.MultiItemAdapter$a */
    class C7017a implements C8293g {

        /* renamed from: a */
        final /* synthetic */ BaseViewHolder f31097a;

        /* renamed from: b */
        final /* synthetic */ boolean f31098b;

        C7017a(MultiItemAdapter multiItemAdapter, BaseViewHolder baseViewHolder, boolean z) {
            this.f31097a = baseViewHolder;
            this.f31098b = z;
        }

        /* renamed from: a */
        public void mo26893a(C3098a aVar) {
            this.f31097a.itemView.setVisibility(0);
            this.f31097a.itemView.getLayoutParams().height = -2;
            this.f31097a.getView(R.id.tv_ads).setBackground(C8343s.m46298f(R.drawable.native_ad_shape));
            this.f31097a.setTextColor(R.id.tv_ads, C8343s.m46295c(R.color.app_sub_title_color));
            Button button = (Button) this.f31097a.getView(R.id.ad_btn_call_to_action);
            button.setBackground(C8343s.m46303k(R.drawable.allow_button_on_shape, R.color.colorAccent));
            NativeAdView nativeAdView = (NativeAdView) this.f31097a.getView(R.id.native_view);
            nativeAdView.setHeadlineView(this.f31097a.getView(R.id.ad_tv_headline));
            nativeAdView.setBodyView(this.f31097a.getView(R.id.ad_tv_advertiser));
            nativeAdView.setCallToActionView(button);
            if (this.f31098b) {
                try {
                    ImageView imageView = (ImageView) this.f31097a.getView(R.id.native_image);
                    imageView.setVisibility(0);
                    nativeAdView.setImageView(imageView);
                    ((ImageView) nativeAdView.getImageView()).setImageDrawable(aVar.mo11318f().get(0).mo11323a());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            ((TextView) nativeAdView.getHeadlineView()).setText(aVar.mo11316d());
            ((TextView) nativeAdView.getHeadlineView()).setTextColor(C8343s.m46295c(R.color.default_text_color));
            ((TextView) nativeAdView.getBodyView()).setText(aVar.mo11314b());
            ((TextView) nativeAdView.getBodyView()).setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
            ((Button) nativeAdView.getCallToActionView()).setText(aVar.mo11315c());
            nativeAdView.setNativeAd(aVar);
        }

        /* renamed from: b */
        public void mo26894b() {
        }
    }

    public MultiItemAdapter(List<T> list) {
        super(list);
    }

    private int getLayoutId(int i) {
        return this.f31096a.get(i, BaseMultiItemQuickAdapter.TYPE_NOT_FOUND);
    }

    /* access modifiers changed from: protected */
    public void addItemType(int i, int i2) {
        if (this.f31096a == null) {
            this.f31096a = new SparseIntArray();
        }
        this.f31096a.put(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo26890c(T t) {
        int parentPosition = getParentPosition(t);
        if (parentPosition >= 0) {
            ((IExpandable) this.mData.get(parentPosition)).getSubItems().remove(t);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo26891d(BaseViewHolder baseViewHolder, boolean z) {
        if (baseViewHolder.itemView.getTag() == null || baseViewHolder.itemView.getTag().toString().isEmpty()) {
            View view = baseViewHolder.itemView;
            view.setTag("loaded" + baseViewHolder.getLayoutPosition());
            baseViewHolder.itemView.setVisibility(8);
            baseViewHolder.itemView.getLayoutParams().height = 0;
            new C8291f().mo29992c(1, new C7017a(this, baseViewHolder, z));
        }
    }

    /* access modifiers changed from: protected */
    public int getDefItemViewType(int i) {
        C2342b bVar = (C2342b) this.mData.get(i);
        if (bVar instanceof C2342b) {
            return bVar.mo9261a();
        }
        return -255;
    }

    /* access modifiers changed from: protected */
    public K onCreateDefViewHolder(ViewGroup viewGroup, int i) {
        return createBaseViewHolder(viewGroup, getLayoutId(i));
    }

    public void remove(int i) {
        List<T> list = this.mData;
        if (list != null && i >= 0 && i < list.size()) {
            C2342b bVar = (C2342b) this.mData.get(i);
            if (bVar instanceof IExpandable) {
                removeAllChild((IExpandable) bVar, i);
            }
            mo26890c(bVar);
            super.remove(i);
        }
    }

    /* access modifiers changed from: protected */
    public void removeAllChild(IExpandable iExpandable, int i) {
        List subItems;
        if (iExpandable.isExpanded() && (subItems = iExpandable.getSubItems()) != null && subItems.size() != 0) {
            int size = subItems.size();
            for (int i2 = 0; i2 < size; i2++) {
                remove(i + 1);
            }
        }
    }
}
