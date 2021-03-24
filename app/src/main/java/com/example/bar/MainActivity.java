package com.example.bar;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.img);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                ViewPropertyAnimator viewPropertyAnimator =imageView.animate();
                viewPropertyAnimator.setInterpolator(new DecelerateInterpolator());
                viewPropertyAnimator.setDuration(3000);
                viewPropertyAnimator.translationX(500f);// 点击X轴位移,再次点击没有效果
//                viewPropertyAnimator.translationY(500f);// 点击Y轴位移,再次点击没有效果
//                viewPropertyAnimator.translationXBy(500f);// 点击X轴位移,再次点击刚刚才结束位置开始移动
//                viewPropertyAnimator.translationYBy(500f);// 点击Y轴位移,再次点击刚刚才结束位置开始移动
//                viewPropertyAnimator.x(500f); //X 轴位移,再次点击没有效果
//                viewPropertyAnimator.xBy(500f); //X 轴位移,再次点击有效果
//                viewPropertyAnimator.y(500f); //Y 轴位移,再次点击有效果
//                viewPropertyAnimator.yBy(500f); //Y 轴位移,再次点击有效果

                viewPropertyAnimator.start();
                // 动画变化更新监听,
                viewPropertyAnimator.setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        Log.e("onAnimationUpdate","111");
                    }
                });
                // 监听
                viewPropertyAnimator.setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        Log.e("onAnimationStart","111");
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        Log.e("onAnimationEnd","111");
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                        Log.e("onAnimationCancel","111");
                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {
                        Log.e("onAnimationRepeat","111");
                    }
                });

                //使用简写
                imageView.animate().setInterpolator(new DecelerateInterpolator())
                        .setDuration(2000)
                        .translationX(600f)
                        .start();
            }
        });

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewPropertyAnimator viewPropertyAnimator =imageView.animate();
                viewPropertyAnimator.setInterpolator(new DecelerateInterpolator());
                viewPropertyAnimator.setDuration(3000);
                viewPropertyAnimator.alpha(0);
                viewPropertyAnimator.start();

                //使用简写
//                imageView.animate().setInterpolator(new DecelerateInterpolator())
//                        .setDuration(2000)
//                        .alpha(0)
//                        .start();
            }
        });

        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewPropertyAnimator viewPropertyAnimator =imageView.animate();
                viewPropertyAnimator.setInterpolator(new DecelerateInterpolator());
                viewPropertyAnimator.setDuration(3000);
//                viewPropertyAnimator.rotation(360); // 顺时针旋转,再次点击没有效果
//                viewPropertyAnimator.rotationBy(360);// 顺时针旋转,再次点击有效果
//                viewPropertyAnimator.rotationX(360); // X轴旋转,再次点击没有效果
//                viewPropertyAnimator.rotationXBy(360);// X轴旋转,再次点击有效果
//                viewPropertyAnimator.rotationY(360);// Y轴旋转,再次点击有效果
                viewPropertyAnimator.rotationYBy(360);// Y轴旋转,再次点击有效果
                viewPropertyAnimator.start();

                //使用简写
//                imageView.animate().setInterpolator(new DecelerateInterpolator())
//                        .setDuration(2000)
//                        .rotation(360)
//                        .start();
            }
        });

        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewPropertyAnimator viewPropertyAnimator =imageView.animate();
                viewPropertyAnimator.setInterpolator(new DecelerateInterpolator());
                viewPropertyAnimator.setDuration(3000);
//                viewPropertyAnimator.scaleX(1.2f); // X轴放大,再次点击没有效果
//                viewPropertyAnimator.scaleXBy(1.2f); // X轴放大,再次点击有效果
//                viewPropertyAnimator.scaleY(1.2f); // Y轴放大,再次点击没有效果
                viewPropertyAnimator.scaleYBy(1.2f); // X轴放大,再次点击有效果
                viewPropertyAnimator.start();

                //使用简写
//                imageView.animate().setInterpolator(new DecelerateInterpolator())
//                        .setDuration(2000)
//                        .scaleX(2f)
//                        .scaleY(2f)
//                        .start();
            }
        });




    }
}