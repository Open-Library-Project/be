package org.open_library_project.be.book.mapper.book;

import lombok.experimental.UtilityClass;
import org.open_library_project.be.book.model.dto.book.request.BookCreateRequest;
import org.open_library_project.be.book.model.entity.BookEntity;

/**
 * BookEntity nesnesi ile ilişkili DTO nesnelerini mapleyen mapper sınıftır.
 */
@UtilityClass
public class BookDtoMapper {

    public static BookEntity mapForSaving(
            final BookCreateRequest bookCreateRequest
    ) {
        return BookEntity.builder()
                .name(bookCreateRequest.getName())
                .pageSize(bookCreateRequest.getPageSize())
                .build();
    }
}
