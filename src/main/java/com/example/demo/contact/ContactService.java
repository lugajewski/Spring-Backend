package com.example.demo.contact;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactService {
    public List<Contact> getContacts()
    {
        Contact c = new Contact(1,"Julia",503453122);
        return  List.of(c);
    }
}
