#include<iostream>
using namespace std;

struct node {
    int data;
    node* next;
};

// Make head global
node* head = NULL;

void insertion(int el, int pos) {
    node* n1 = new node;
    n1->data = el;

    if(pos == 0) {
        n1->next = head;
        head = n1;
        return;
    }

    node* temp = head;

    for(int i = 0; i < pos - 1; i++) {
        temp = temp->next;
        if(temp == NULL) {
            cout << "Invalid position!\n";
            return;
        }
    }

    n1->next = temp->next;
    temp->next = n1;
}

int main() {

    int i, n, e, el, pos;
    node* temp = NULL;

    cout<<"Enter number of elements: ";
    cin >> n;

    for(i = 0; i < n; i++) {
        cout << "Enter element: ";
        cin >> e;

        node* newNode = new node;
        newNode->data = e;
        newNode->next = NULL;

        if(head == NULL) {
            head = newNode;
            temp = newNode;
        } 
        else {
            temp->next = newNode;
            temp = newNode;
        }
    }

    // Print BEFORE insertion
    cout << "\nList before insertion:\n";
    temp = head;
    while(temp != NULL) {
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << endl;

    // Get insertion input
    cout << "\nEnter element to insert: ";
    cin >> el;

    cout << "Enter position: ";
    cin >> pos;

    // Call your insertion function
    insertion(el, pos);

    // Print AFTER insertion
    cout << "\nList after insertion:\n";
    temp = head;
    while(temp != NULL) {
        cout << temp->data << " -> ";
        temp = temp->next;
    }

    return 0;
}
