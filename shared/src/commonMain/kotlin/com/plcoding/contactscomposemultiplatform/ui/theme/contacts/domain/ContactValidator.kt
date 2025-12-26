package com.plcoding.contactscomposemultiplatform.ui.theme.contacts.domain

object ContactValidator {
    fun validateContact(contact: Contact): ValidationResult{
        val result = ValidationResult()
        if (contact.firstName.isBlank()){
            result = result.copy(
                firstNameError = "The first name cannot be empty.."
            )
        }
        if (contact.firstName.isBlank()){
            result = result.copy(
                firstNameError = "The first name cannot be empty.."
            )
        }

        if (contact.firstName.isBlank()){
            result = result.copy(
                firstNameError = "The first name cannot be empty.."
            )
        }

        if (contact.firstName.isBlank()){
            result = result.copy(
                firstNameError = "The first name cannot be empty.."
            )
        }



    }
    data class ValidationResult(
        val firstNameError: String?= null,
        val lastNameError: String? = null,
        val emailError: String? = null,
        val phoneNumberError: String? = null
    )

}