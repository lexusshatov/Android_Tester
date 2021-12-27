package com.example.androidtester.ui.test

import com.example.androidtester.core.Question

object TestQuestions {

    val questions: List<Question> = listOf(
        Question(
            name = "Для чего нужен RecyclerView? Какие схожести и различия с ListView? Преимущества RecyclerView перед ListView",
            answers = listOf(
                "RecyclerView переиспользует ViewHolder’ы",
                "ListView является более оптимизированной версией RecyclerView",
                "Это один и тот же компонент с разными названиями",
                "RecyclerView – устаревший компонент, вместо него лучше использовать ListView"
            )
        ),
        Question(
            name = "Для чего применяется ItemDecoration?",
            answers = listOf(
                "ItemDecoration используется для кастомизации элементов в RecyclerView",
                "Это корневой элемент окна приложения, в котором отрисовываются остальные элементы разметки",
                "ItemDecoration – тег в xml, который позволяет отобразить элемент в разметке, который будет видно только в режиме Design в Android Studio и не будет видно на реальном устройстве"
            )
        ),
        Question(
            name = "Сколько child’ов может иметь ScrollView?",
            answers = listOf(
                "1",
                "Ни одного, поскольку он не является контейнером",
                "Сколько-угодно"
            )
        ),
        Question(
            name = "Что такое LinearLayout?",
            answers = listOf(
                "Контейнер, который размещает элементы один за другим",
                "ViewGroup, который размещает элементы в порядке возрастания/убывания",
                "Это ViewGroup, элементы внутри которого имеют размер в процентах от размера контейнера"
            )
        ),
        Question(
            name = "Fragment – это…",
            answers = listOf(
                "Второстепенный компонент Android, который может существовать только в контексте Activity",
                "Интерфейс, предоставляющий доступ к части экрана",
                "Часть выделенной памяти устройства"
            )
        ),
        Question(
            name = "В чем особенность основных компонентов Android (Android Architecture Components)?",
            answers = listOf(
                "Все основные компоненты Android имеют доступ к Context’у",
                "Для того, чтобы создать приложение необходимо использовать все основные компоненты Android",
                "Основные компоненты можно создавать не прописывая их в manifest, в отличии от остальных"
            )
        )
    )
}