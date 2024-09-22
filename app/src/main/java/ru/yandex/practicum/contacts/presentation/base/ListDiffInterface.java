package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;

public interface ListDiffInterface<T> {
    boolean theSameAs(@NonNull T item);
    boolean equals(Object item);
}
