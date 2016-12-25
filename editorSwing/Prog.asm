extern printf
extern scanf
SECTION .data
msg0: db "%d" ,10,0
SECTION .bss
a: resd 1
b: resd 1
c: resd 1
SECTION .text
global main
main:
push ebp
mov ebp,esp
mov eax,20
mov [a],eax
mov eax,20
mov [b],eax
mov ecx , 9
.loop0: 
push ecx
push dword  [a]
push dword msg0
call printf
add esp,8
pop ecx
loop .loop0
mov ecx , [b]
push ecx 
mov ecx , 2
push ecx 
pop ecx
pop eax
add eax,ecx
push eax
mov ecx , [a]
push ecx 
pop ecx
pop eax
add eax,ecx
push eax
mov [c] ,eax
add esp,4
mov esp,ebp
pop ebp
mov eax,0
ret
