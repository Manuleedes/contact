package com.plcoding.contactscomposemultiplatform.ui.theme.contacts.domain

object ContactValidator {
    fun validateContact(contact: Contact): ValidationResult{
        var result = ValidationResult()
        if (contact.firstName.isBlank()){
            result = result.copy(
                firstNameError = "The first name cannot be empty.."
            )
        }
        if (contact.lastName.isBlank()){
            result = result.copy(
                lastNameError = "The last name cannot be empty.."
            )
        }
        val emailRegex = Regex("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}\$")
        if(!emailRegex.matches(contact.email)) {
            result = result.copy(emailError = "This is not a valid email.")
        }
//        val kenyaPhoneRegex = Regex("^(?:\\+254|0)?7\\d{8}$")
//        if (!kenyaPhoneRegex.matches(contact.phoneNumber)) {
//            result = result.copy(phoneNumberError = "Enter a valid Kenyan phone number.")
//        }
        val phoneRegex = Regex("^\\+?[0-9]{7,15}$")
        if (!phoneRegex.matches(contact.phoneNumber)) {
            result = result.copy(phoneNumberError = "This is not a valid phone number.")
        }
        return result
    }
    data class ValidationResult(
        val firstNameError: String?= null,
        val lastNameError: String? = null,
        val emailError: String? = null,
        val phoneNumberError: String? = null
    )

}