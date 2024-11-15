#include <iostream>
#define MAX 20

using namespace std;

int main() {
    int arr[MAX], temp, n;

    cout << "Enter the number of elements: ";
    cin >> n;

    // Input array elements
    for (int i = 0; i < n; i++) {
        cout << "Enter element <" << (i + 1) << ": ";
        cin >> arr[i];
    }

    cout << "Unsorted list is:\n";
    for (int i = 0; i < n; i++) {
        if (i < n - 1) {
            cout << arr[i] << ", ";
        } else {
            cout << arr[i];  // No comma after last element
        }
    }
    cout << "\n";

    // Optimized Bubble Sort
    bool swapped;
    for (int i = 0; i < n - 1; i++) {
        swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap using a temporary variable
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }

        // If no two elements were swapped by inner loop, then break
        if (!swapped) {
            break;
        }

        // Print after each pass
        cout << "After Pass <" << (i + 1) << "> elements are: ";
        for (int k = 0; k < n; k++) {
            if (k < n - 1) {
                cout << arr[k] << ", ";
            } else {
                cout << arr[k];  // No comma after last element
            }
        }
        cout << "\n";
    }

    cout << "Sorted list is: ";
    for (int i = 0; i < n; i++) {
        if (i < n - 1) {
            cout << arr[i] << ", ";
        } else {
            cout << arr[i];  // No comma after last element
        }
    }
    return 0;
}
