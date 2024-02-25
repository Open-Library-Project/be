package org.open_library_project.be.book.service.impl;

import lombok.RequiredArgsConstructor;
import org.open_library_project.be.book.mapper.book.BookDtoMapper;
import org.open_library_project.be.book.model.dto.book.request.BookCreateRequest;
import org.open_library_project.be.book.model.entity.BookEntity;
import org.open_library_project.be.book.repository.BookRepository;
import org.open_library_project.be.book.service.BookCreateService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class BookCreateServiceImpl implements BookCreateService {

    private final BookRepository bookRepository;

    @Override
    public BookEntity create(
            final BookCreateRequest bookCreateRequest
    ) {
        final BookEntity bookEntityToBeSave = BookDtoMapper
                .mapForSaving(bookCreateRequest);

        return bookRepository.save(bookEntityToBeSave);
    }
}
