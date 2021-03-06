package org.smartregister.eusm.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import org.smartregister.eusm.R;

public class ProductInfoQuestionViewHolder extends RecyclerView.ViewHolder {

    private final ImageView imageProductInfoQuestionView;

    private final TextView productInfoQuestionView;

    private final TextView productInfoAnswerView;

    private final Context context;

    public ProductInfoQuestionViewHolder(@NonNull View itemView) {
        super(itemView);

        context = itemView.getContext();

        imageProductInfoQuestionView = itemView.findViewById(R.id.image_product_info_question);

        productInfoQuestionView = itemView.findViewById(R.id.txt_product_info_question);

        productInfoAnswerView = itemView.findViewById(R.id.txt_product_info_answer);
    }

    public void setImageProductInfoQuestion(int questionPhoto) {
        this.imageProductInfoQuestionView.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), questionPhoto, context.getTheme()));
    }

    public void setProductInfoQuestion(String question) {
        this.productInfoQuestionView.setText(question);
    }

    public void setProductInfoAnswer(String answer) {
        this.productInfoAnswerView.setText(answer);
    }
}
